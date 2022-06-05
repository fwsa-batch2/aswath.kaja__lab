import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class override extends Thread{

    public void run(){
        System.out.println("start");
        for(int i=1; i <= 10 ;i++){
            System.out.println(i);
        }
        System.out.println("end");

    }
    
    public static void main(String[] args) {
        // System.out.printf("%-5s,%d", "asw",5);   

        //     String a = "malayalam";
        //     char c ;
        //     String str = "";
        //     int i = 0;
        // do{
        //   c = a.charAt(i);
        //   str = c + str;
        //  i++;
        // }   
        // while (i < a.length()); 
        // System.out.println(str);
        // }

   
        //     LinkedList<String> l = new LinkedList<String>();
        //     l.add("Orange");
        //     l.add("Apple");
        //     l.add("Peach");
        //     l.add("Guava");
        //     l.add("Pear");

        //     Collections.reverse(l);  
        //     System.out.println("After Reversing");  
        //     System.out.println(l);  
            
        //     ArrayList<String> aList = new ArrayList<String>(l);
        //     System.out.println("The ArrayList elements are: ");
        //   for (Object i : aList) {
        //        System.out.println(i);
        //     }
      
     override obj = new override(); 
     obj.start();    
}
}
