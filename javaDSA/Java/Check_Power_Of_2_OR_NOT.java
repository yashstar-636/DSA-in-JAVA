package JavaWithDsa;
// LeetCode question   (Easy level)

import java.util.Scanner;

public class Check_Power_Of_2_OR_NOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();


//                    #Method 1 (simple logic odd even)
//        if (n == 0) {
//            System.out.println("no");
//        }
//            while (n % 2 == 0) {
//                n = n / 2;
//            }
//
//        if (n == 1) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }


//                        #Method 2 (using bit manipulation)
        if(n==0){
        System.out.println("no");
        return;
    }
        if ((n & n-1)==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
