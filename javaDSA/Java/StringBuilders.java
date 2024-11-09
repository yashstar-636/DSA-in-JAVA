package JavaWithDsa;

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        StringBuilder sb = new StringBuilder(sc.next());     for getting input from user
        StringBuilder sb = new StringBuilder("Tony");

//          get a character
        System.out.println(sb.charAt(0));


//        set character
             sb.setCharAt(0,'s');
        System.out.println(sb);

//        insert character

        sb.insert(0,'s');
        System.out.println(sb);


//        delete a character

        sb.delete(0,2);
        System.out.println(sb);




        sb.insert(0,'T');
        System.out.println(sb);

//        append a character

        sb.append("Stark");
        System.out.println(sb);

//        length
        System.out.println(sb.length());




        sb.delete(4,9);
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);

        StringBuilder s = new StringBuilder("Arjun");
        System.out.println(s.charAt(0));
        s.setCharAt(0,'a');
        System.out.println(s);
        s.insert(0,'A');
        System.out.println(s);
        s.append("Panchal");
        System.out.println(s);
        System.out.println(s.length());
      s.delete(0,11);
        System.out.println(s);
    }

}
