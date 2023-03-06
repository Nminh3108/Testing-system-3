package demo;

public class DemoBoxingAndUnBoxing {
    public static void main(String[] args) {
        int a = 100;
        Integer aObject = Integer.valueOf(a);  // boxing: Chuyen doi so int thanh dang Object


        Integer b = new Integer(5);
        int  bPrimitive = b.intValue();  //unboxing : Chuyen doi tu kieu du lieu object sang dang  primitive


    }
}

