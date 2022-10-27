def salute ( name ,wish)
   puts "#{wish.capitalize} Mr.#{name.split().last}"  
end
puts salute("Nelson Rolihlahla Mandela", "hello")
puts salute("Sir Alan Turing", "welcome")