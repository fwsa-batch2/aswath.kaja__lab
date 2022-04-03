public class Logical_operator {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("And &&     :"+ (a<b && b<a) );
        System.out.println("or  ||     :"+ (a<b || b<a) );
        System.out.println("not !      :"+ !(a<b || b<a) );  //(not) is used to reverse the result


    }
}
