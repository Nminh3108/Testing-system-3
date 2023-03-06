package assignment;

public class Excercise3 {
    public static void main(String[] args) {
        Excercise3 excercise3 = new Excercise3();
        excercise3.question2();
    }
    public void question1(){
        Integer luong = new Integer(5000); // int -> Integer
        float luongConvert = luong.intValue();
        System.out.println(luongConvert);
    }

    public void question2(){
        String ababc = "1234567" ;
        int convert = Integer.valueOf(ababc);
        int convert2 = Integer.parseInt(ababc);
        int convert3 = new Integer(ababc);
        System.out.println(convert);
        System.out.println(convert2);
        System.out.println(convert3);
    }

    public void question3(){
        Integer integer = new Integer(12345);
        int convert = Integer.valueOf(integer);
    }

}
