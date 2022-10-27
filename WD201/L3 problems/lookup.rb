 def get_command_line_argument
#     # ARGV is an array that Ruby defines for us,
#     # which contains all the arguments we passed to it
#     # when invoking the script from the command line.
#     # https://docs.ruby-lang.org/en/2.4.0/ARGF.html
     if ARGV.empty?
       puts "Usage: ruby lookup.rb <domain>"
       exit
     end
     ARGV.first
  end
  
#   # `domain` contains the domain name we have to look up.
  domain = get_command_line_argument
  
  # File.readlines reads a file and returns an
  # array of string, where each element is a line
  # https://www.rubydoc.info/stdlib/core/IO:readlines
  dns_raw = File.readlines("zone")
  
  def parse_dns(raw)
    raw.
      reject { |line| line.empty? or line[0] == "#" }.
      map { |line| line.strip.split(", ") }.
      reject { |record| record.length < 3 }.
      each_with_object({}) do |record, records|
      records[record[1]] = {
        type: record[0],
        target: record[2],
      }
      print "raw    "
      puts raw
      puts records
    end
  end

  def resolve(dns_records, lookup_chain, domain)  #dns_records - datas as array from zone file , lookupchain
    record = dns_records[domain] 
    if (!record)
      return ["Error: Record not found for " + domain]
    elsif record[:type] == "CNAME"
      lookup_chain.push(record[:target])
      lookup_chain = resolve(dns_records, lookup_chain, record[:target])
    elsif record[:type] == "A"
      return lookup_chain.push(record[:target])
    else
      return ["Invalid record type for " + domain]
    end
  end

  
  
  dns_records = parse_dns(dns_raw)
  print "dns   "
  lookup_chain = [domain]
  lookup_chain = resolve(dns_records, lookup_chain, domain)
  puts lookup_chain.join(" => ")