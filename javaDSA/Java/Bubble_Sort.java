package JavaWithDsa;
//i is used in this only as a counter not value.

//                  Time complexity:-O(n^2)
//                  Space complexity:-O(1)
public class Bubble_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
      int arr []={1,2,3,4,5,7,10,9,8};

//               for ascending order

        for (int i =0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //            Printing the array for ascending order
        System.out.println("Ascending order");
        printArray(arr);


//                  for descending order
        for (int i =0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//            Printing the array for descending order
        System.out.println("Descending order");
            printArray(arr);

    }
}
