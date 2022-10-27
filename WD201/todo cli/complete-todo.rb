require "./connect_db.rb"
require "./todo.rb"


connect_db!
def start_mark_as_complete
Todo.show_list
puts "Which todo do you want to mark as complete? (Enter id): "
todo_id = gets.strip.to_i
todo = Todo.mark_as_complete(todo_id)
puts "Done! ID [#{todo_id}] is marked as complete"
# puts todo.to_displayable_string
end