package JavaWithDsa;

import java.util.Scanner;

public class Arrays_que_2D_print_elem {
    public static  boolean search(int arr[][ ], int val){
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if(arr[i][j]==val)
                    return true;
            }
        }
        return false;
    }
    public static void printarr(int arr[][]){
        for (int i =0;i< arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
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
       printarr(arr);
        System.out.println("enter the value which you have to find");
        int val = sc.nextInt();
        System.out.println(search(arr , val));
    }
}
