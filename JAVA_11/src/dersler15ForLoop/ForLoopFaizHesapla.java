package dersler15ForLoop;

import java.util.Scanner;

public class ForLoopFaizHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double anaPara= 1000;
        double faizOrani = 5;
        double kar = 0;
        int ay = 0;

        System.out.print("Lütfen bakiyenizi girin...");
        anaPara = input.nextDouble();

        //double kar= anaPara * faizOrani / 100;
        //anaPara = anaPara + kar;

        System.out.println("Kac ay icin hesaplama yapayim");
        ay = input.nextInt();
        System.out.println("Faiz oranini giriniz :");
        faizOrani = input.nextDouble();
        for (int i  = 1; i <= ay; i++) {
            kar = anaPara * faizOrani / 100;
            anaPara = anaPara + kar;

        }
        System.out.println("Bakiye : " + anaPara);
        System.out.println("Aylik ödenecek tutar = " + (anaPara / ay));
    }
}
