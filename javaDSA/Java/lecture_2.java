package JavaWithDsa;


import java.util.Scanner;


public class lecture_2 {


//    second question


//    public static void main(String[] args) {
//         final double pi =3.14;
//        Scanner sc = new Scanner(System.in);
//      float r = sc.nextFloat();
//    double circumference = 2*pi*r;
//     double area =pi*r*r;
//        System.out.println(circumference);
//        System.out.println(area);
//
//    }

//    third question

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(+n +"*1=" + (n*1));
//        System.out.println(+n +"*2=" +(n*2));
//        System.out.println(+n +"*3=" +(n*3));
//        System.out.println(+n +"*4=" +(n*4));
//        System.out.println(+n +"*5=" +(n*5));
//        System.out.println(+n +"*6=" +(n*6));
//        System.out.println(+n +"*7=" +(n*7));
//        System.out.println(+n +"*8=" +(n*8));
//        System.out.println(+n +"*9=" +(n*9));
//        System.out.println(+n +"*10=" +(n*10));
//    }

//                    or(using for loop)

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println(n + "*" + i + "=" +n*i);
//        }
//    }

//                or(using while loop)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = sc.nextInt();
        int i =1;
        while(i<=range){
            System.out.println(n + "*" + i + "=" +n*i);
            i++;
        }
    }
}

