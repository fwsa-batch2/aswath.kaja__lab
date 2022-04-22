public class factorial {
    public static void main(String[] args) {
        int num = 5 , fact = 1;
      for(int i = num ; i >= 1 ; i-- ){
          fact *= i;
      }
      System.out.println(fact);
    }
}
