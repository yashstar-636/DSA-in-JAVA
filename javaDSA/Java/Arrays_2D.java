package JavaWithDsa;

import java.util.Scanner;

public class Arrays_2D {
    public static void printArray(int Array_2D[][]){
        for (int i =0;i<Array_2D.length;i++){
            for (int j =0;j<Array_2D[i].length;j++) {
                System.out.print(Array_2D[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] Array_2d = new int [rows][columns];
        for (int i =0;i<rows;i++){
            for (int j =0;j<columns;j++){
                Array_2d[i][j]=sc.nextInt();

            }
        }
        printArray(Array_2d);
        System.out.println("Enter the number which you have to find");
        int x= sc.nextInt();
        for (int i =0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if (Array_2d[i][j]==x){
                    System.out.println("Number is found at this index"+"("+i+" , " +j +")");

                }
            }
        }

    }
}
