package JavaWithDsa;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

//        adding the value in the set
        set.add(10);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        System.out.println(set);

//        remove
        set.remove(10);
        System.out.println(set);
//         size
        System.out.println(set.size());
//          iterate
//        first way to iterate the set
        Iterator it = set.iterator();   //think in the it now there is no value means null
        // & hashset does not have an order so we have to use this iterator method by implementing the iterator class package
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
// second way to iterate the set

        for (int val:set){
            System.out.print(val+" ");
        }
        System.out.println();
//        search
        if (set.contains(80)){
            System.out.println("present");
        }
        if (!set.contains(100)){
            System.out.println("does not contain");
        }
//      isEmpty
           if (!set.isEmpty()){
               System.out.println("set is not empty");
           }

    }
}
