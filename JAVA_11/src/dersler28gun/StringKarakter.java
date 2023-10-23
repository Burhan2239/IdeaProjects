package dersler28gun;

import java.util.Scanner;

public class StringKarakter {
    public static void main(String[] args) {

        // Kullanicida aldigimiz Stringin son karakterini dinamik olarak bulmak
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz!");
        String str = sc.nextLine();

        char sonKarakter = sonKarakter(str);
        System.out.println("sonKarakter = " + sonKarakter);

    }

    public static char sonKarakter(String s){
        return s.charAt(s.length()-1);
    }

}
