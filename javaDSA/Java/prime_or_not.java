package JavaWithDsa;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to check is it prime or not");
        int number = sc.nextInt();
        int count =0;
        if (number == 0 || number == 1) {
            System.out.println("it is not a prime number");
        } else {

            for (int i = 2; i < number; i++) {
               if (number%i==0){
                   count++;
                   break;
               }
            }
            if(count==0){
                System.out.println(+number +"  is a prime number");
            }
            else{
                System.out.println(+number + "  is not a prime number");
            }
        }
    }
}
