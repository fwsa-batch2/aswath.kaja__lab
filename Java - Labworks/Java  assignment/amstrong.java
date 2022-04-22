import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 digit number:");
        int number= in.nextInt();
        int temp = number;
        int digit1 , digit2 , digit3;
        digit1= temp % 10;
        temp = temp/10;
        digit2= temp % 10;
        temp = temp/10;        
        digit3= temp % 10;
        temp = temp/10;
        int digit = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if(number==digit){
            System.out.println(number + "  is a amstrong number");
        }
        else{
            System.out.println(number+"  is not amstrong");
        }

     }
}
