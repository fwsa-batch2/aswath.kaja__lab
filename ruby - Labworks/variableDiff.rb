class NEW_CLASS
        @@const_name = "meenu"
         @name = "surya"
       def set_name(new_name)
        @name = new_name
       end
       def get_name
         @name
       end
        def get_const_name
            @@const_name
        end
      def set_const_name(new_name)
            @@const_name = new_name
      end
    end
    class_1 = NEW_CLASS.new
    class_1.set_const_name("aswath")
    puts class_1.get_const_name
    class_2 = NEW_CLASS.new
    class_2.set_const_name("rishi")
    puts class_2.get_const_name
    class_1.set_name("as")
    class_2.set_name("ha")
    puts class_1.get_name

    puts class_2.get_const_name

