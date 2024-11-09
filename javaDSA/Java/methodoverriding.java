package JavaWithDsa;


class a{
    String name ;
    public void print(String name){
//        System.out.println("Arjun");
        this.name = name;
        System.out.println(name);
    }
}
class b extends a{
String str;
    public void print(String name){
//        System.out.println("panchal");
        this.str=name;
        System.out.println(str);
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        String name ;
        a obj = new a();
        b obj1 = new b();
        obj.print(obj.name="Arjun");
        obj1.print(obj1.name="Panchal");

    }
}
