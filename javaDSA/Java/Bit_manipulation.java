package JavaWithDsa;

import java.util.Scanner;

public class Bit_manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        System.out.println("Enter the position(index)");
        int position = sc.nextInt();
        int bitMask = 1 << position;

//        in this we have to use bitwise and bcoz in logical and we get a wrong ans so we have to use bitwise and (&)


//        #1            GET Bit
//        i)Bit Mask:1<<i(position)
//        ii)Operation:AND


        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }


//        #2            SET Bit (set 1)
//        i)Bit Mask:1<<i(position)
//        ii)Operation:OR

//            int newNumber = bitMask | n;
//            System.out.println(newNumber);


//        #3            CLEAR Bit    (make 0)
//        i)Bit Mask:1<<i(position)
//        ii)Operation:AND  with not(bitMask) its means do and with compliment of bitMask

//        int newBitMask = ~bitMask;
//        int newNumber = newBitMask & n ;
//        System.out.println(newNumber);


//        #4            UPDATE Bit     *toggle a bit means make o->1 & 1->0(make zero to one and one to zero)its simple means make a update of it.
//
//              Two cases are there make 0 OR make 1
/*        For making 0 :-do clear operation{
               i)Bit Mask:1<<i(position)
       ii)Operation:AND  with not(bitMask) its means do and with compliment of bitMask
    }
    */

/*        For making 1:- do set operation {
        i)Bit Mask:1<<i(position)
        ii)Operation:OR
    }
//*/
//        System.out.println("Enter the operation which you want to perform");
//        int operation = sc.nextInt();
//        if (operation==1){
//            //set operation for making 1
//            int newNumber =bitMask | n;
//            System.out.println(newNumber);
//        }
//        else{
//            //clear operation for making 0
//            int newBitMask = ~bitMask;
//            int newNumber = newBitMask & n;
//            System.out.println(newNumber);
//        }

//                      EXTRA
//        bit wise right shift with sign extension and bitwise right shift with zero extension both are same
//zero extension means only positive number and sign extension means both positive and negative number are there.
  int sign_extension=15>>2;
  int zero_extension =15>>>2 ;
        System.out.println(sign_extension);
        System.out.println(zero_extension);
    }
}