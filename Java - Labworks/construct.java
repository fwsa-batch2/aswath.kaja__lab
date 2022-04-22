public class construct {
     int length, breadth;
     construct(){
         length = 5;
         breadth = 4;   
     }
     construct(int x , int y){
        length = x;
        breadth = y;   
    }
     int area (){
         int area = length * breadth;
         return area;
     }
     public static void main(String[] args) {
    //   
         construct o1 = new construct();
         System.out.println(o1.area());
     //    
         construct o2 = new construct(3,4);
         System.out.println(o2.area());
     //
     }
}
