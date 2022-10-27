require 'active_record'

def connect_db!
  ActiveRecord::Base.establish_connection(
    host: 'localhost', 
    adapter: 'mysql2',
    database: 'todo_db', 
    username: 'root', 
    password: 'password'
  )
end

