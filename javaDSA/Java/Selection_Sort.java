package JavaWithDsa;



//                  Time complexity:-O(n^2)
//                  Space complexity:-O(1)



public class Selection_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,9,8,3,2,1,4,6,7,10,15,13,14,12,11,19,16,18,17,20};


//               for ascending order
        for (int i =0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j< arr.length;j++){
              if (arr[j]<arr[smallest]){
                  smallest=j;
              }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
           arr[i]=temp;
        }
        //            Printing the array for ascending order
        System.out.println("Ascending order");
        printArray(arr);




        //                  for descending order


        for (int i =0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]>arr[smallest]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        //            Printing the array for descending order
        System.out.println("Descending order");
        printArray(arr);


    }
}
