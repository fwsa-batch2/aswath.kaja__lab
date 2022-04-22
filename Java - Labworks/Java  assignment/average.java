import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        // Program to find the sum and average
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int lim = in.nextInt();
        int sum = 0,avg;
        for(int i = 1;i <= lim;i++){
            System.out.println("Enter the number" + i +":");
            int num = in.nextInt();
            sum +=num;
        }
        System.out.println("Sum of the numbers"+sum);
        System.out.println("Average of the numbers"+sum/lim);
    }
}