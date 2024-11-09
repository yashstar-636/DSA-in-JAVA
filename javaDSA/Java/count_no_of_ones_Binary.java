package JavaWithDsa;




//with time complexity O(logn)
/* here we use the binary search bcoz array is sorted and all ones are are comming first position and by using binary
 search we also get the time complexity logn so */
public class count_no_of_ones_Binary {
//    public  static  int count_ones(int arr[],int low , int high){
//
//    }


//    #first approach with O(n)  time complexity
//   public  static  int count_ones(int arr[]) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] ==1) {
//                  count++;
//            }
//
//        }
//        return  count;
//    }


//    # second approach logn time complexity (binary search)
    public static int count_ones(int arr[],int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) {
                if (arr[mid - 1] == 1 || mid == 0) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[mid + 1] == 0 || mid == n - 1) {
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            }

        }
        return 0;
    }
    public static void main(String[] args) {

       int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0};
       int n = arr.length;
        System.out.println(count_ones(arr,n));
    }
}
