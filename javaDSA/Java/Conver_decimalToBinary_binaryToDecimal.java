package JavaWithDsa;

import java.util.Scanner;

public class Conver_decimalToBinary_binaryToDecimal {
    public static void decimalToBinary(int n) {
       int number = n ;
       int binaryNumber [] =new int[32];
       int i =0;
       while (number>0){
           binaryNumber[i]=number%2;
           number = number/2;
           i++;
    }
//             we have to reverse the array because in the lcm from top to bottom we have to write from right to left and in this it is written as like array left to right
//          printing binary array in reverse order detail written above
        for (int j =i-1;j>=0;j--) {
            System.out.print(binaryNumber[j] +" ");

        }
    }

//    public static long binaryToDecimal(int n) {
//        int decimal_value = 0;
//        int base = 1;
//        int number = n;
//        int temp = number;
//        while (temp>0) {
//            int last_digit = temp % 10;
//            temp = temp / 10;
//            decimal_value = decimal_value + last_digit * base;
//            base = base * 2;
//        }
//        return decimal_value;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to convert binary to decimal or decimal to binary");
        int n = sc.nextInt();
//        System.out.println(binaryToDecimal(n));
     decimalToBinary(n);
    }
}
