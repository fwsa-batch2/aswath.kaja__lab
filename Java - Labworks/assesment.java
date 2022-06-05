import java.util.Scanner;
public class assesment
{
    public static void main(String args[])
    {
        int row, i, j, gap = 1;
      
        row = 5;
        gap = row - 1;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= gap; i++)
            {
                System.out.print(" ");
            }
            gap--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        gap = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= gap; i++)
            {
                System.out.print(" ");
            }
            gap++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}









