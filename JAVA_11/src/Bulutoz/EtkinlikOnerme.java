package Bulutoz;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.println("Hava sicakligi giriniz : ");
        sicaklik = scan.nextInt();

        if (sicaklik > 30) {
            System.out.println("Bu havada yüzmeye gidilir !");
        } else if (sicaklik<=30 && sicaklik>=5) {
            System.out.println("Bu havada en iy sinemaya gidilir !");
        }else {
            System.out.println("Bu havada en iyi kayaga gidilir !");
        }
    }
}
