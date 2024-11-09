package JavaWithDsa;

import java.util.Scanner;



//                  Q-10(Bonus question) exercise-1(shrddha didi){java+dsa}




public class Fibonachii_series_BONUS {
//    function for fibonachii series using recursion
    public static  void printFibonachii(int a ,int b , int n){
        if (n==0){
            return;
        }
        System.out.print(a+ " ");
        printFibonachii(b, a+b ,n-1);
    }
    public static void main(String[] args) {


//        using iterative method
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int n1=0,n2=1,n3;
//
//        if (n>=2){
//            System.out.print(+n1+" "+n2);
//            for (int i=2;i<n;i++){
//                n3=n1+n2;
//                System.out.print(" " +n3);
//                n1=n2;
//                n2=n3;
//            }
//        }
//        else{
//            System.out.println("not exist");
//        }
//
//        using recursion method
     printFibonachii(0 ,1,10);
    }
}


