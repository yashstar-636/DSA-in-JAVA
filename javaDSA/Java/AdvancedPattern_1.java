package JavaWithDsa;

import java.util.Scanner;

//                ButterFly pattern

//        *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *

public class AdvancedPattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            for (int j =i;j<n;j++){
//                System.out.print(" ");
//            }
//            for (int j =i;j<n;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        for (int i =1;i<=n;i++){
//            for (int j =i;j<=n;j++){
//                System.out.print("*");
//            }
//            for (int j =1;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int j =i;j<=n;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }



//                OR in the next way

        for (int i =1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =n;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
