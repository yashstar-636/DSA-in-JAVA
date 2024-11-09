package JavaWithDsa;

import java.util.Scanner;


//            # 3rd way to print a pascals triangle
//Time Complexity =o(n2) & Space Complexity=o(n)
// space complexity is o(n)because of an extra array we use we decresed it by o(1) without using array (as we do in the first method)
public class Pascals_triangle_3 {

    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Enter value of n: ");
                int n = in.nextInt();

                int ncr[][] = new int[n][n];

               ncr[0][0] = 1;  //First element is always 1

                //start from 2nd row i.e from i=1
                for(int i=1; i<n; i++){
                    //First element of each row is always 1
                    ncr[i][0] = 1;
                    for(int j=1; j<=i; j++){
                        ncr[i][j] = ncr[i-1][j-1] + ncr[i-1][j];
                    }
                }

                //Output the array
                for(int i=0; i<n; i++){
                    //Output the blank space
                    for(int k=0; k<n-i; k++){
                        System.out.print(" ");
                    }
                    for(int j=0; j<=i; j++){
                        System.out.print(ncr[i][j]+" ");
                    }
                    System.out.println();
                }

            }
        }
