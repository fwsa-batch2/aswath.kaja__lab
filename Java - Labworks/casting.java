class casting {
    public static void main(String[] args) {
//type casting :- Type casting is when you assign a value of one primitive data type to another type.
  /*
 wide castening
    byte -> short -> char -> int -> long -> float -> double
narrow castening
    double -> float -> long -> int -> char -> short -> byte
    */

  // wide castening
        int a = 10;
        double b = a;   // changing an integer to double
        System.out.println("int    :" + a);
        System.out.println("double :" + b);

     //narrow castening
        double c = 25.55;
        int d = (int) c;  // changing an double to integer
        System.out.println("double :" + c);
        System.out.println("int    :" + d);

    }
}
