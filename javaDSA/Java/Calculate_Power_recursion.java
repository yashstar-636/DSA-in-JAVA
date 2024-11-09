package JavaWithDsa;

public class Calculate_Power_recursion {
//    function for calculating power using recursion (with stack height = n)
//    public static  int calcPower(int x, int n){
//        if (n==0) {
//            return 1;
//        }
//        if (x==0){

//            return 0;
//        }
//        int x_ = calcPower( x ,n-1);
//        int xn= x * x_;
//        return xn;
//     }



    //    function for calculating power using recursion (with stack height = log n )
    public static  int calcPower(int x, int n){
        if (n==0) {
            return 1;
        }
        if (x==0){
            return 0;
        }
//        if n is even
        if (n%2==0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
//        if n is odd
        else{
            return calcPower(x,n/2) * calcPower(x,n/2)* x ;
        }

    }


    public static void main(String[] args) {
        System.out.println( calcPower(2,5));
    }
}
