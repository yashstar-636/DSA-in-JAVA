package JavaWithDsa;

import java.util.Scanner;

public class Array_2D_spiral_order_matrix {
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
        int rowStart = 0;
        int rowEnd = row-1;
        int colStart = 0;
        int colEnd = col-1;
//        To print spiral order matrix
        while (rowStart<=rowEnd && colStart<=colEnd){
//              1
        for (int i =colStart;i<=colEnd;i++){
            System.out.print(arr[rowStart][i]+" ");
        }
        rowStart++;


//        2
            for (int i =rowStart;i<=rowEnd;i++){
                System.out.print(arr[i][colEnd]+ " ");
            }
            colEnd--;

//            3
            for (int i =colEnd;i>=colStart;i--){
                System.out.print(arr[rowEnd][i]+  " ");
            }
            rowEnd--;

//            4
            for (int i =rowEnd;i>=rowStart;i--){
                System.out.print(arr[i][colStart]+" ");
            }
            colStart++;
            System.out.println();
       }


    }
}
