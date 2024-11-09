package JavaWithDsa;

public class Advanced_Towe_Hanoi_Recursion {
    public static void towerOfHanoi(int n , String source , String helper , String destination){
        if (n==1){
            System.out.println("transfer disk "+n+"from "+source+" to " + destination);
            return;
        }
        towerOfHanoi(n-1 ,source ,destination ,helper);
        System.out.println("transfer disk "+n+"from "+source+" to " + destination);
        towerOfHanoi(n-1 , helper , source, destination);
    }
    public static void main(String[] args) {

        towerOfHanoi(3 , "s", "h ", "d");

    }
}
