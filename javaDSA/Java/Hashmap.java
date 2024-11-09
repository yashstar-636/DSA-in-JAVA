package JavaWithDsa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();


//        Insertion operation
        map.put("india", 1);
        map.put("canada", 2);
        map.put("usa", 3);
        map.put("china", 4);
//        System.out.println(map);
        map.put("usa", 6);
//        System.out.println(map);

//
////        search
//        if (map.containsKey("india")) {
//            System.out.println("present");
//        } else {
//            System.out.println("absent");
//        }
//        System.out.println(map.get("india"));
//        System.out.println(map.get("africa"));  //if key not exist then they return a null value
//
//
//        int arr [ ]={1,5,4};
//
////        first way (simple techinque for array with index).
//        for (int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println();
////        second way to iterate the array using its value not index    //we use this techinque to iterate the map and we also used this for iterate the set
//        for (int val:arr){
//            System.out.print(val+" ");
//        }
//        System.out.println();

//        iterate in HashMap

//        first way through entry_set( entry means whole key and value is there).
        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
// second way through key_set (
        Set<String>  keys = map.keySet();
        for (String key:keys){
            System.out.println(key+ " " +map.get(key)+" ");
        }



//        remove the pair
        map.remove("china");
        System.out.println(map);


    }
}
