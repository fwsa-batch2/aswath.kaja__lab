import java.util.*;

import javax.print.DocFlavor.STRING;
public class listex{
    public static void main(String[] args) {

LinkedList llist = new LinkedList<>();

   llist.add (4);
   llist.add (2);
   llist.add (3);
   
System.out.println(llist);

String a = "venkat";
a= "aswath";

System.out.println(a);









        /*
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array ,
If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed .
*/


        ArrayList<Integer> alist = new ArrayList<>();       
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
  //contains() - checks whether the contains the element or not 
        System.out.println(alist.contains(5));

  //get() - gets the value of the given index     
        System.out.println(alist.get(2));

  //remove() - remove the value of the given index
        System.out.println(alist.remove(3));  
        
        System.out.println(alist);

  //set(index,value) -set the value in the already given index
        System.out.println(alist.set(2, 4));
  
  //indexOf(value) -index position of the value
      System.out.println("index position"+alist.indexOf(2));

  //addAll() - add all the values

    System.out.println(alist);

ArrayList blist = new ArrayList();
  blist.add(1);
  blist.add("s");

 
System.out.println( "Adding different types of array" + blist.addAll(alist)); 
System.out.println(blist); 

    }
}