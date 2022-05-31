import java.util.*;

public class map {
    public static void main(String[] args) {
    /*
    Java HashMap class implements the Map interface which allows us to store key and value pairs, where keys should be unique. 
    If you try to insert the duplicate key, it will replace the element of the corresponding key.
    */ 

 HashMap<Integer,String> map = new HashMap<>();

 //put -  Used to assign the value to the specific key.
    map.put(4, "musaaf");
    map.put(1, "aswath");
    map.put(2, "haiden");
    map.put(3, "musaraf");

 System.out.println(map);   

//get -  Used to retrieve or fetch the value mapped by the key.
 System.out.println(map.get(2));

//remove - Used in Hashmap to remove the mapping of any particular key from the map.
System.out.println(map.remove(1));

//containsKey - Used to check whether the particular key is mapped into Hashmap or not.
System.out.println(map.containsKey(2));

//containsValue- Used to check whether particular value is mapped by single or more than one key in Hashmap.
System.out.println(map.containsValue("musaraf"));

//size - Used to get the size of the map which is literally the numbers of key in the Map.
System.out.println(map.size());

//isEmpty - checks whether the map is empty.
System.out.println(map.isEmpty());
 
/*  HASH MAP
     It is Slow where HashMap is Faster compared to Hashtable
 Only one thread works at one time where in HashMap multiple threads works simultaneously
 Does not allow Null key where HashMap allows to use Null key once*/
Hashtable <Integer,String>table= new Hashtable<>();
 table.put(1, "aswath");
 table.put(2, "haiden");
 table.put(3, "musaraf");
 table.put(4, "musaraf");
 System.out.println("table"+table);

/*
Java LinkedHashMap class is HashMap and Linked list implementation of the Map interface, with predictable iteration order.
 It inherits the HashMap class and implements the Map interface. Similar to the HashMap with an 
 additional feature of maintaining an order of elements inserted into it.
 */
LinkedHashMap<Integer,String> hMap= new LinkedHashMap<>();

hMap.put(1, "aswath");
hMap.put(2, "aw");
hMap.put(3, "aswh");
System.out.println("hmap"+ hMap);


}
}
