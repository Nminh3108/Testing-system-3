package assignment;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Excercise4 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Excercise4 excercise4 = new Excercise4();
        excercise4.question12();
    }

    public void question1() {
        System.out.println("Moi bao nhap vao chuoi:");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("SO ky tu la:" + length);
    }

    public void question2() {
        System.out.println("Moi ban nhap vao chuoi 1:");
        String input1 = scanner.nextLine();
        System.out.println("Moi ban nhap vao chuoi 2:");
        String input2 = scanner.nextLine();

        String rs1 = input1 + input2;
        String rs2 = input1.concat(input2);

        System.out.println(rs1);
        System.out.println(rs2);
    }

    public void question3() {
        //nguyen -> Nguyen
        System.out.println("Moi ban nhap vao ten:");
        String name = scanner.nextLine();
        String first = String.valueOf(name.charAt(0)).toUpperCase();
        String other = name.substring(1);
        System.out.println(first + other);
    }

    public void question4() {
        //ngyen -> Nguyen
        System.out.println("Moi ban nhap vao ten :");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) ;
        int i = 0;
        String text = "Ky tu thu" + (i + i) + "la :" + String.valueOf(name.charAt(i)).toUpperCase();
        System.out.println(text);
    }

    public void question6() {
        System.out.println("Moi ban nhap vao ten day du");
        String fullName = scanner.nextLine();
        String[] arrName = fullName.split("");
        String ho = arrName[0];
        String midName = arrName[1];
        String name = arrName[2];

        System.out.println("Ten : " + ho);
        System.out.println("Ten Dem La:" + midName);
        System.out.println("Ten la:" + name);
    }

    public void question11() {
        String a1 = "abc123abc";
        int count = 0;
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) == 'a') {
                count++;
            }
        }
    }

    public void question12() {
        String a1 = "I am developer";
        String[] arrString = a1.split("");
        System.out.println(Arrays.toString(arrString));
        String  kq ="";
        for (int i =arrString.length -1 ; i==0; i-- ) {
            kq += " " +arrString[i];
        }
        System.out.println(kq.trim());
    }

public void question13(){
        String s1 = "abc1234abc";
        boolean kq = false;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) >= 40 && s1.charAt(i) <= 57);

        }
}

    }

