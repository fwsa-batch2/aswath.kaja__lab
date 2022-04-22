import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        int c = add(a,b);
        int d = sub(a,b);
        int e=  mul(a,b);
        int f = div(a,b);
     System.out.println(c);
     System.out.println(d);
     System.out.println(e);
     System.out.println(f);
    }
    public static  int add(int num1, int num2){
          int add = num1 + num2;
             return add;
    }
    public static  int sub(int num1, int num2){
          int sub = num1 - num2;
             return sub;
    }
    public static  int mul(int num1, int num2){
         int mul = num1 * num2;
             return mul;
    }
    public static int div(int num1, int num2){
         int div = num1 / num2;  
             return div;
    }
}
