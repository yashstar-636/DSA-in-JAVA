package JavaWithDsa;

//Pivot(central point where all elements round around them)
//Partion(with the help of them we arrange the element )
//pivot chossing :-1) we take a random element as our pivot
//                 2)find median of all elements and make as a pivot
//                 3)make first element of array as a pivot
//                 4)make last element of array as a pivot (this most used case)and we also use this for quick sort implementation
//                 single element is always a sorted element so no need to apply the sorting on a single element

/*     Quick sort and merge sort is the most importing sorting for interview point of view.
Time complexity:-for worst case=o(n^2) and for average case=o(nlogn) but generally  the quick sort time complexity is the average time complexity.
because the worst case only occur (important)when the pivot element is always the smallest or the largest element(if array is already sorted).

if we have less space then use the quick sort(because mostly the average time complexity is there so is less space is there then we have to use this(Quick sort)
and if space is more then use the merge sort because in that we have to take one extra array and the array increased the space complexity from logn to n.
 and we have to use merge sort when we want nlogn time complexity in the worst case also and we have an extra space for taking an array
 */



public class Quick_Sort_Ascending {
//    partition function for getting a right index of the pivot element for ascending order
    public static int partition(int arr[] ,int low , int high){
        int pivot = arr[high];
        int i =low-1;

      for(int j=low;j<high;j++){
          if (arr[j]<pivot){
              i++;
//              swap
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }

      }
      i++;
      int temp=arr[i];
      arr[i]=pivot;
      arr[high]=temp;
      return i;
    }



//    recursive function for implement the quick sort and in this we pass the low,high,array
    public static void quick_sort(int arr[], int low , int high) {
        if (low < high) {
            int pindx =partition(arr,low,high);
            quick_sort(arr,low,pindx-1);
            quick_sort(arr,pindx+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n = arr.length;
        quick_sort(arr , 0 ,n-1);
//        print array
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
