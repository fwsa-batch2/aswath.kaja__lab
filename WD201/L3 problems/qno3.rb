todos = [["Send invoice", "money"],  ["Clean room", "organize"],  ["Pay rent", "money"],  ["Arrange books", "organize"],  ["Pay taxes", "money"], ["Buy groceries", "food"]  ]
dup = []

todos.each do |i|
    dup.push(i[1])  
end

category = dup.uniq
p category
full_arr = []

for i in 0...category.length do
    cat_each = category[i]
    temp_arr = []
    print cat_each
    puts ": "
   for j in 0...todos.length do
            if cat_each == todos[j][1]
           temp_arr.push(todos[j][0])
            end
    end 
    pre_full_arr = [cat_each,temp_arr]
    full_arr.push(pre_full_arr)
end
print full_arr
