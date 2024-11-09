package JavaWithDsa;

import java.util.Scanner;

public class count_ones_zeros_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n =sc.nextInt();
        int ones = 0;
        int zeros=0;
        int i=0;


        while ((1<<i)<=n){

            if ((1<<i & n) == 0) {
//                System.out.println("bit was zero");
                zeros++;
            } else {
//                System.out.println("bit was one");
                ones++;
            }
            i++;
        }
        System.out.println("No of zeros= "+zeros);
        System.out.println("No of ones= "+ones);
    }
}
