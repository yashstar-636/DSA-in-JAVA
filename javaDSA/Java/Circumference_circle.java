package JavaWithDsa;

import java.util.Scanner;

public class Circumference_circle {
    final static double pi=3.14;
    public static double circumference(double radius){
        return 2*pi*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(circumference(radius));

    }
}
