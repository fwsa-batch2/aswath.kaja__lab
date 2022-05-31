import java.io.*;
import java.util.*;

public class io {
    public static void main(String[] args) throws IOException {
      
File file = new File("D:\\aswath.kaja__lab\\Java - Labworks\\stat.txt");
// Reading from a file
Scanner scan = new Scanner(file);
while(scan.hasNextLine()){
   System.out.println(scan.nextLine());
    }
}
}




// FileWriter fileWriter = new FileWriter("D:\\aswath.kaja__lab\\Java - Labworks\\stat.txt");
//    //writing in a file
// fileWriter.write("Hello Guys");
// fileWriter.close();
// System.out.println("written in the file");
 


     // createNewFile() CREATE NEW FILE
    //  if(file.createNewFile()){
    //     System.out.println("File created");
    //     }
    // else{
    //      System.out.println("File exists");
    //     }

     // exists() checks where the file is available or not
    //    if(file.exists()){
    //        System.out.println("file exists");
    //     }
    //       else{
    //         System.out.println("not found");
    //        }














    
