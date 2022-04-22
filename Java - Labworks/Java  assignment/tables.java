import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Which table you want :");
    int num =in.nextInt();
    System.out.print("Enter the limit :");
     int limit = in.nextInt();
     for(int i=1;i<=limit;i++){
         int table = num * i;
         System.out.println(num +"x"+i+"="+table);
     }
    }
}
