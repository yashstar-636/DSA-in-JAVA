package JavaWithDsa;



class oop{
    String type , color;
      public void write (){
          System.out.println(this.color);
      }
      public void writed(){
          System.out.println(this.type +" "+this.color);
      }
}
public class oops {
    public static void main(String[] args) {
        oop obj = new oop();
        obj.type="mec";
        obj.color="blue";
        obj.write();
        oop obj1 = new oop();
        obj1.type="bmw";
        obj1.color="red";
       obj1.writed();

    }
}
