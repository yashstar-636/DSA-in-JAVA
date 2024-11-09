package JavaWithDsa;

import java.util.Scanner;



//            PATTERN

//                  *****
//                 *****
//                *****
//               *****
//              *****

public class AdvancePattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



//                    1st way to print this pattern by increasing decreasing

        for (int i =1;i<=n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("*" );
            }
            for (int j = i; j <n ; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }

//                    2nd way to print this pattern by shraddha didi logic


        for (int i =1;i<=n;i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }






    }

}
