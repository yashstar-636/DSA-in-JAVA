package JavaWithDsa;

import java.util.Scanner;


//            # 1st way to print a pascals triangle
//Time Complexity =o(n2)  & Space Complexity=o(1)
public class Pascals_triangle {

    public static void main(String[] args) {
        Pascals_triangle obj = new Pascals_triangle();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int number =1;
        for (int i =0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for (int j =0;j<=i;j++){

            if (j==0||i==j){
                number =1;
            }
            else{
               number =number*(i-j+1)/j;
            }
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
