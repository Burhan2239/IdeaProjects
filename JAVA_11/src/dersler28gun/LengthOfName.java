package dersler28gun;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve Soyadinizi giriniz!");

        String adSoyad = sc.nextLine();
        int isimUzunluk = adSoyad.length();

        System.out.println("isimUzunluk = " + isimUzunluk);
    }
}
