require "date"
class Todo
    @@date = Date.today
    attr_accessor :text, :date, :comp
    def initialize(text,date,comp)
        @text = text
        @date = date
        @comp = comp
    end
    def overdue?
        if @date < @@date
            true
        else
            false
        end
    end
    def due_later?
        if @date > @@date
            true
        else
            false
        end
    end
    def due_today?
        if @date == @@date
            true
        else
            false
        end
    end
    def to_displayable_string
        if @comp
            "[X]  #{@text}"
        else
            "[ ]  #{@text}"
        end
    end
end
class TodosList
    def initialize(todos)
        @todos = todos
    end
    def add(record)
        @todos.push(record)
    end
    def overdue
        TodosList.new(@todos.filter {|todo| todo.overdue?})
    end
    def due_today
        TodosList.new(@todos.filter {|todo| todo.due_today?})
    end
    def due_later
        TodosList.new(@todos.filter {|todo| todo.due_later?})
    end
    def to_displayable_list
        out = []
        @todos.map do |i|
            print = (i.comp) ? "[X]" : "[ ]"
            out.push("#{i.to_displayable_string}#{i.text} #{i.date}")
        end
    return out
    end
end
date = Date.today
todo = [
    { text: "Submit assignment", due_date: date - 1, completed: false },
    { text: "Pay rent", due_date: date, completed: true },
    { text: "File taxes", due_date: date + 1, completed: false },
    { text: "Call Acme Corp.", due_date: date + 1, completed: false },
]
todos = todo.map { |todo|
    Todo.new(todo[:text], todo[:due_date], todo[:completed])
}
todos_list = TodosList.new(todos)
todos_list.add(Todo.new("Service vehicle", date, false))
puts "My Todo-list\n\n"
puts "Overdue\n"
puts todos_list.overdue.to_displayable_list
puts "\n\n"
puts "Due Today\n"
puts todos_list.due_today.to_displayable_list
puts "\n\n"
puts "Due Later\n"
puts todos_list.due_later.to_displayable_list
puts "\n\n"