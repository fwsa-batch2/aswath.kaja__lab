require "./connect_db.rb"



def create_new_todo
  puts "Todo text:"
  todo_text = gets.strip
  return nil if todo_text.empty?

  puts "How many days from now is it due? (give an integer value)"
  due_in_days = gets.strip.to_i

  return_todo = {
    todo_text: todo_text,
    due_in_days: due_in_days
  }

connect_db!
h = return_todo
if h
  new_todo = Todo.add_task(h)
  puts "New todo created with id #{new_todo.id}"
  Todo.show_list
end
end

