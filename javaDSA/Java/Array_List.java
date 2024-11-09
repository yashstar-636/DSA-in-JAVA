package JavaWithDsa;
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
     ArrayList <Integer> list=new ArrayList<Integer>();

//     Add elements
     list.add(10);
     list.add(100);
     list.add(20);
     list.add(30);

        System.out.println(list);

//        get elements
        int element = list.get(1);
        System.out.println(element);

//        add elements in between
        list.add(2,500);
        System.out.println(list);

//        set elements (Modify)
        list.set(1,1000000000);
        System.out.println(list);
//        delete element
        list.remove(1);
        System.out.println(list);

//       Size(count all elements that is stored in the arraylist)
       int size= list.size();
        System.out.println(size);

//        for loop 1st way to iterate
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
//        2nd way to iterate
        for (int val :list){
            System.out.print(val);
        }
        System.out.println();
//       sorting
        Collections.sort(list);     //collections is inbuilt class in the java and sort is the function in this class.
        System.out.println(list);
//
//

//
    }
}
