package JavaWithDsa;


//      Q-8(exercise-1) shraddha didi

import java.util.Scanner;

public class calculate_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to our calculator");
        System.out.println("Enter X");
        int x =sc.nextInt();
        System.out.println("Enter n");
        int n =sc.nextInt();
        int result =1;
        for (int i =1;i<=n;i++){
            result = result*x;
        }
        System.out.println("x to the power n is: "+result);
    }

}
