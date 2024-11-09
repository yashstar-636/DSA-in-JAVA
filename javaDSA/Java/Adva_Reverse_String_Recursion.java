package JavaWithDsa;

public class Adva_Reverse_String_Recursion {
    public static void print_reverse(String str, int idx){
        if (idx<0){
            return;
        }
        System.out.print(str.charAt(idx));
        print_reverse(str , idx-1);

    }
    public static void main(String[] args) {
        String str = "Arjun";
        System.out.println(str);

        print_reverse(str , str.length()-1);
    }
}
