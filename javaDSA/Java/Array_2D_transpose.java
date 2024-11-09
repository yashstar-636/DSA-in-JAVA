package JavaWithDsa;

import java.util.Scanner;

public class Array_2D_transpose {
    public static  void printTranspose(int arr [] [], int col , int row){
        for (int j =0;j<col;j++){
            for (int i=0 ;i<row;i++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("enter columns");
        int col = sc.nextInt();
        int [][]arr= new int[row][col];
        for (int i =0;i< row;i++){
            for (int j =0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printTranspose(arr, col , row);
    }
}
