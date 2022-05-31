package com.Aswath;

public class swap {
    public static void main(String[] args) {
        int numbers[] = new int[]{1,2,3,};
        int smallNum = numbers[0];
        int largeNum = numbers[0];
           for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] > largeNum)
             largeNum = numbers[i];
            else if (numbers[i] < smallNum)
             smallNum= numbers[i];
  }
  System.out.println("largest    =" +largeNum+"  smallest   ="+smallNum);







    }
}
