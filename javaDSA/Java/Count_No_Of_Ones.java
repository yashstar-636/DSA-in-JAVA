package JavaWithDsa;

import java.util.Scanner;

public class Count_No_Of_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while (n>0){

            count+=(n&1);
            n=n>>1;

        }
        System.out.println(count);
    }
}
