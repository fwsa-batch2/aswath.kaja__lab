# grade1 = 10
# grade2 = 30
# grade3 = 80
# if grade1 > grade2 || grade1 > grade3
#   puts "Grade 1 is not the lowest score!"
# elsif grade1 < grade2 || grade1 < grade3
#   puts "Grade 1 is  the lowest score!"
# end
# name = "aswa" 
# ar = Array.new
#  for num in ar do
#     ar.push(name[num]) 
#  end
# # ar.push(name[1])
# # ar.push(name[2])
# # ar.push(name[3])
# print ar



# name = "as\"wa" 
#  puts name.include? "as"

# a = 0
# puts name[a]
# ++a
# puts name[a]
# puts name[a]

# num = 5
# 10.times {|i| puts num * i }

# nums = [2, 4, 200, 400]
# new_nums = nums.map {|number| p number*8 }
# new_nums.each {|n| puts n }

# print "H"
# num = gets.chomp.to_i
# def prime num
#   for i in 3 do   
#     if num > i
#         num % i != 0
#         flag = true
#         p "Prime"
#     else
#         p "not"
#     end
#   end   
#  end  

# def generate_salutation(emails)
#     if emails.length == 1
#       "Hello #{emails[0]}!"
#     elsif emails.length == 2
#       "Hello #{emails[0]} and #{emails[1]}!"
#     elsif emails.length > 2
#       "Hello #{emails[0..-2].join(', ')}, and #{emails.last}!"
#     end
#   end
  
  recipients = [
    ["Srinath"],
    ["Jadeja", "Kambli"],
    ["Sachin", "Sidhu", "Kumble"]
  ]
  
for i in 0..recipients.length do
   p recipients[i]
end


  

