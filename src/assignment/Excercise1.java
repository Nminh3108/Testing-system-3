package assignment;

public class Excercise1 {
    public static void main(String[] args ) {
        Excercise1 excercise1 = new Excercise1();
        excercise1.question3();
        int kq = excercise1.question4(4, 2);
        System.out.println(kq);
    }
    public void question1(){
        float luong1 = 5240.9f;
        float luong2 = 10987.855f;
        int luong1int = (int) luong1 ;
        System.out.println(luong1int);
        int luong2int = (int) luong2 ;
        System.out.println(luong2int);
    }

    public void question2(){
        int random = 12;
        String numberString = String.valueOf(random);
        while (numberString.length() < 5 ){
            numberString = "0" + numberString ;
        }
        System.out.println(numberString);
    }

    public void question3(){
        int random = 1234 ;
        int kq = random % 100;
        System.out.println(kq);
    }

    public int question4(int a,int b){
        int c =a/b ;
        return c;
    }
}
