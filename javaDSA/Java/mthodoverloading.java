package JavaWithDsa;



class a1{
    int rollno;
    String div , name ;
    public void print(String name){
        System.out.println(name);
    }
    public void print(String name , int rollno ){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void print(String name , int rollno  , String div){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(div);
    }


}
public class mthodoverloading {
    public static void main(String[] args) {

        a1 obj = new a1();
        obj.div="a";
        obj.rollno=56;
        obj.name="Arjun";
        obj.print(obj.name);
        obj.print(obj.name , obj.rollno , obj.div);

    }
}
