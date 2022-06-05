class NEW_CLASS
  @@class_var 
   @instance_var 
 def set_name(new_name)
  @instance_var = new_name
 end
 def get_name
   @instance_var
 end

  def set_class_name(new_name)
      @@class_var = new_name
  end

  def get_class_name
       @@class_var
  end
end
#setting and getting values 
class_1 = NEW_CLASS.new
class_2 = NEW_CLASS.new
class_1.set_name("riya") 
class_1.set_class_name("riyas")
class_2.set_class_name("aswath")
class_2.set_name("ash")
puts class_1.get_name
puts class_1.get_class_name
puts class_2.get_name
puts class_2.get_class_name