public class test {
    public static void main(String[] args) {
    boolean hi = false;
      int num = 5;
 for (int i =0; i < num ; i++){
        if(i*(i+1) == num)
        {
          System.out.println("it is pronic" + num);
          hi = true;
            break;
        }
       }
  if(hi == true){
        System.out.println("it is pronic   " + num);
       }
       else{
        System.out.println("it is not pronic   " + num);

       }
    }
}
