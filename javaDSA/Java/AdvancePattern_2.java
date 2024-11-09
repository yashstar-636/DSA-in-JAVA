package JavaWithDsa;

import java.util.Scanner;



//                DIAMOND PATTERN
//                 *
//                ***
//               *****
//              *******
//               *******
//                *****
//                 ***
//                  *


public class AdvancePattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//
//        for (int i = 1; i <= n; i++) {
//            for (int j =0;j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j <= n; j++) {
//                System.out.print("*");
//            }
//            for (int j = i; j <n ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }


//                    OR


//        for spaces n-i & for stars odd (2*i-1)


        for (int i =1;i<=n;i++){
            //                for spaces  n-1
            for( int j =1;j<=n-i;j++){

                System.out.print(" ");
            }
//            for stars  odd then 2*i-1
            for (int j=1;j<=2*i-1;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n;i>=1;i--){
            //                for spaces  n-1
            for( int j =0;j<=n-i;j++){

                System.out.print(" ");
            }
//            for stars  odd then 2*i-1
            for (int j=1;j<=2*i-1;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}