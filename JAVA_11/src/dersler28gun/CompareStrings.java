package dersler28gun;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        // Kullanicidan iki farkli String alip bu stringleri ayri bir method ile uzunluklarini
        // karsilastirarak sonucu gosteren bir program yaziniz
        // "CAN" - "CAN" --> true
        // "CAN" - "CEM" --> true
        // "CAN" - "CANO" --> FALSE

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 1. Stringi giriniz!");
        String str1 = sc.nextLine();

        System.out.println("Lutfen 2. Stringi giriniz!");
        String str2 = sc.nextLine();

        System.out.println("Stringler esit uzunlukta mi? " + compareStrings(str1, str2));

    }

    public static boolean compareStrings(String s1, String s2) {
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s2.length() = " + s2.length());
        return s1.length() == s2.length();
    }
}
