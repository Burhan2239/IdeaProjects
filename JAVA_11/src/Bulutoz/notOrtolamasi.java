package Bulutoz;

import java.util.Scanner;

public class notOrtolamasi {

    public static void main(String[] args) {
        int quiz , vize , ffinal ;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz notunu Giriniz :");
        quiz = input.nextInt();
        System.out.println("Vize Notunu Giriniz :");
        vize = input.nextInt();
        System.out.println("FFiNAL Notunu Giriniz :");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
        System.out.println("Not Ortalamaniz : " + ortalama);
        String sonuc = (ortalama >= 50 ) ? "Gectiniz" : "Kaldiniz" ;
        System.out.println(sonuc);
    }
}
