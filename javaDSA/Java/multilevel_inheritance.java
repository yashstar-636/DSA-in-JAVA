package JavaWithDsa;


class shape {
    public  void area(){
        System.out.println("display area");
    }
}
class triangle extends shape{
    public  void areas(){
        System.out.println("display triangle");
    }
}
class equilateral_triangle extends triangle {
    public  void areass(){
        System.out.println("display equlitriangle");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        equilateral_triangle obj = new equilateral_triangle();
        obj.area();
        obj.areas();
        obj.areass();

    }
}
