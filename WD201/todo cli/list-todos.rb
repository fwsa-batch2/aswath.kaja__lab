require "./connect_db.rb"
require "./todo.rb"
require "./add-todo.rb"
require "./complete-todo.rb"


connect_db!
Todo.show_list

puts "This is Simple Todo CLI program: \n Enter Task to Continue... \n Enter [add] to create a new task, [done] to mark a task as completed and [show] to list all Tasks"
command = gets.strip.downcase

if command == "add"
    create_new_todo
elsif  command == "done"
    start_mark_as_complete
elsif  command == "show"
    output = Todo.to_displayable_list
    puts output
end