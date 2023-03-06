package demo;

public class DemoDatetypeCasting {
    public static void main(String[] args) {
        int i =100;
        long l=i;
        float f =l ;
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        double d =100.04;
//        long l2 = (long) d;
//        int i2 = (int) l2 ;
//
//        System.out.println("Gia tri double:" +d);
//        System.out.println("gia tri long: " +l2);
//        System.out.println("Gia tri int: "+ i2);
//
        long l3 = Long.MAX_VALUE;
        int i3 = (int) l3 ;
        System.out.println(l3);
        System.out.println(i3);
    }
}
