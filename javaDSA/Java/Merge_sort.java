package JavaWithDsa;


//      Merge sort is based on the divide and conquer technique
//        for ascending order
//        Time complexity:-worst case=o(nlogn)  for divide we have to divide till the we reach at the base condition so for this time is log n and for
//        every single element we have to conquer it so for this time complexity is n so total time complexity is o(nlogn).
//        Space complexity:-o(n)

/*
if we have less space the use the quick sort(because mostly the average time complexity is there so is less space is there then we have to use this(Quick sort)
and if space is more then use the merge sort because in that we have to take one extra array and the array increased the space complexity from logn to n.
  and we have to use merge sort when we want nlogn time complexity in the worst case also and we have an extra space for taking an array */


public class Merge_sort {
    public  static  void conquer(int arr[],int si, int mid,int ei){
        int merged [] =new int [ei-si+1];
        int idx1=si;
        int idx2 = mid+1;
        int x=0;
        while (idx1<=mid && idx2<=ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
            while (idx1<=mid){
                merged[x]=arr[idx1];
                x++; idx1++;
            }
            while (idx2<=ei){
                merged[x]=arr[idx2];
                 x++;idx2++;
            }
        for (int i =0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
        }


    public static  void divide(int arr[],int si,int ei ){
        if (si>=ei){
            return;
        }
     int mid =si + (ei-si)/2;
     divide(arr,si,mid);
     divide(arr,mid+1,ei);
     conquer(arr, si , mid , ei);
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n =arr.length;
//        call divide
        divide(arr, 0,n-1);
//        print the array
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
