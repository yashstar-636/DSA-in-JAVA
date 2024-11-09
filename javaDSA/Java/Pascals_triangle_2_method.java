package JavaWithDsa;

import java.util.Scanner;
//            # 2nd way to print a pascals triangle
//Time Complexity =o(n2 ) & Space Complexity=o(1)

public class Pascals_triangle_2_method {
    static  int fact(int n ){

        if (n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
   static int coeef(int n ,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();


          for (int i =0;i<n;i++){
              for (int j=1;j<=n-i;j++){
                  System.out.print(" ");
              }
              for (int j =0;j<=i;j++){
                  System.out.print(coeef(i,j) + " ");
              }
              System.out.println();
          }
    }
}
