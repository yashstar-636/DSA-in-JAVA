package JavaWithDsa;

import java.util.Scanner;

public class reverse_string_using_sb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder(sc.next());   time complexity:-0(n)

//        StringBuilder newsb = new StringBuilder(" ");
//
//        for (int i = sb.length()-1;i>=0;i--){
//            newsb =newsb.append(sb.charAt(i));
//        }
//        System.out.println(newsb);



//        or 2nd method  time complexity:-0(n)
        System.out.println("Enter the string");
        StringBuilder sb = new StringBuilder(sc.next());
        for (int i =0;i<sb.length()/2;i++){
            int front =i;
            int back=sb.length()-i-1;
            char frontChar=sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);


    }
}
