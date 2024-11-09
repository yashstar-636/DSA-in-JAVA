package JavaWithDsa;

import java.util.Scanner;


//    Q-7 (Exercise_1)  shraddha didi

public class count_o_1_negative {
    public static void main(String[] args) {
        int postive=0 , negative=0,zero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue and 0 to stop");
        int input = sc.nextInt();
        while (input==1){
            System.out.println("Enter your number");
            int number = sc.nextInt();
            if (number > 0) {
                postive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Press 1 to continue and 0 to stop");
             input = sc.nextInt();
        }
        System.out.println("positives " +postive);
        System.out.println("negatives " +negative);
        System.out.println("zeros " +zero);
    }
}
