package JavaWithDsa;

//                  Time complexity:-O(n^2)
//                  Space complexity:-O(1)

public class
Insertion_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
//         for increasing
        int arr[]= {7,8,3,1,2};
      for(int i =1;i<arr.length;i++){
          int current =arr[i];
          int j=i-1;
          while (j>=0   &&  current<arr[j]){
              arr[j+1]=arr[j];
              j--;
          }
//          placement
          arr[j+1]=current;
      }
        System.out.println("Ascending order");
       printArray(arr);

//    for decreasing


        for(int i =1;i<arr.length;i++){
            int current =arr[i];
            int j=i-1;
            while (j>=0   &&  current>arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
//          placement
            arr[j+1]=current;
        }
        System.out.println("Descending order");
        printArray(arr);


    }
}
