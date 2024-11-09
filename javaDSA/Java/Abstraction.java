package JavaWithDsa;

 abstract class animal{
   abstract void walk();
     public void print(){
         System.out.println("arjun");
     }
}
class horse extends animal{
    public void  walk(){
        System.out.println("walks on 4 legs");
    }

}
class chicken extends animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
     horse a = new horse();
     a.walk();
     a.print();
     chicken obj = new chicken();
     obj.walk();
     obj.print();

    }

}
