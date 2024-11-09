package JavaWithDsa;






//                  Q-9(Bonus question) exercise-1(shrddha didi){java+dsa}

//                    GCD(greatest common divisor) is also known as HCF(highest common factor) or GCF(greatest common factor)


import java.util.Scanner;

public class GCD_Q_9_BONUS {


//    # 2nd way using functions

    public static int gcd(int n1, int n2){
        while (n1!=n2){
            if (n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        return n1;
    }

    //    # 3rd way using functions
//    public static int gcd(int n1, int n2){
//        while (n2!=0){
//            if (n1>n2)
//                n1=n1-n2;
//            else
//                n2=n2-n1;
//        }
//       return n1;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=1;

//                    #1st way


//        for (int i=1;i<=n1&&i<=n2;i++){
//            if (n1%i==0&&n2%i==0){
//                gcd=i;
//            }
//        }
//        System.out.println("GCD= "+gcd);

        System.out.println(gcd(n1,n2));

    }
}
