package JavaWithDsa;

import java.util.Scanner;

public class Array_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       for (int i =0;i< arr.length;i++){
           if (arr[i] < min) {
               min=arr[i];
           }
           if (arr[i]>max){
               max=arr[i];
           }
       }
        System.out.println("Minimum value = " +min);
        System.out.println("Maximum value = " +max);

    }
}
