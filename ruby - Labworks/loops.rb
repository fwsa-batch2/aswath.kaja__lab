print "Enter one number : "
num = gets.chomp.to_i 
puts "test : #{num}"
loop do
    puts num
    num += 1
    if num > 10
        break
    end
end

while num < 16
    puts num 
    num+=1
end

for num in 16..20
    puts num 
end