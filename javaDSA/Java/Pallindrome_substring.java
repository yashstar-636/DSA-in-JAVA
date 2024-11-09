package JavaWithDsa;

import java.util.HashSet;
import java.util.Scanner;

public class Pallindrome_substring {
    public static boolean isPallindrome(String str){
        int li =0;
        int ri=str.length()-1;
        while (li<ri){
            char left = str.charAt(li);
            char right = str.charAt(ri);
            if (left!=right){
                return false;
            }
            li++;
            ri--;

        }
        return  true;
    }
    public static  void solution(String str){
        HashSet<String> set = new HashSet<>();
        for (int i=0;i< str.length();i++){
            for (int j =i+1;j<=str.length();j++){
                String ss = str.substring(i,j);
                if (isPallindrome(ss)){
                    set.add(ss);
                }
            }

        }
        System.out.println(set);
        System.out.println(set.size());
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
