package JavaWithDsa;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();


//                        #pattern 1
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        #pattern 2

//        for (int i =n;i>=1;i--){
//            for (int j =1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//                OR
//        for (int i =1;i<=n;i++){
//            for (int j =i;j<=n;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        #pattern 3(imp)


//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15
//
//        int s=1;
//        for (int i =1;i<=n;i++){
//
//            for (int j =1;j<=i;j++){
//                System.out.print(s+" ");
//                s++;
//            }
//            System.out.println();
//        }


//                #pattern 4(imp)

//        1
//        0  1
//        1  0  1
//        0  1  0  1
//        1  0  1  0  1
//
//        for (int i =1;i<=n;i++){
//            for (int j =1;j<=i;j++){
//               if((i+j)%2==0){
//                   System.out.print("1");
//               }
//               else
//                   System.out.print("0");
//            }
//            System.out.println();
//        }




    }
}
