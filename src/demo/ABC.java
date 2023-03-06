package demo;

public class ABC {
    public static void main(String[] args ) {
        String a = "123";
        String b = "123";
        String c = new String("123") ;
        String d = new String("123") ;

        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//true
        System.out.println(c == d);//false
        System.out.println(c.equals(d));//true
    }
}
