package JavaWithDsa;

import java.util.Scanner;

public class Binary_search {    // The array is in the sorted manner always.

//          Time complexity:-O(logN)
//          Space complexity:-O(1) for iterative ,O(logN) for recursive

    public static void binarySearch(int arr[],int first , int last , int key){

       while (first<=last){
           int mid = (first+last)/2;
           if (arr[mid]<key){
               first=mid+1;
           }
           else if(arr[mid]==key){
               System.out.println("Element is found at index " +mid );
               break;
           }
           else{
            last=mid-1;
           }

       }
       if (first>last){
           System.out.println("Element is not found");
       }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value which you want to find");
        int key = sc.nextInt();
        int last = arr.length-1;
        binarySearch(arr,0,last,key);


    }
}