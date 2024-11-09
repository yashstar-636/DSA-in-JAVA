package JavaWithDsa;

import java.util.Scanner;

public class Lecture_7_functions {
    public static int sum(int a , int b){
        return a+b;
    }
    public static int product(int a, int b){
        return a*b;
    }
    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b = sc.nextInt();
        int sum = Lecture_7_functions.sum(a,b);
        System.out.println(sum);
        System.out.println(product(a,b));
        System.out.println("Enter the number to find factorial of it");
        int n =sc.nextInt();
        System.out.println(factorial(n));
    }
}
