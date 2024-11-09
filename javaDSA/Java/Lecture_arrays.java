package JavaWithDsa;

import java.util.Scanner;

public class Lecture_arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[]=new int[size];
        for (int i =0;i<size;i++){
          array[i]=sc.nextInt();
        }
        System.out.println("Enter the value which you want to check");
        int x = sc.nextInt();
        for (int i=0;i<size;i++){
            if (array[i]==x){
                System.out.println(i);
                return;
            }
        }
    }
}
