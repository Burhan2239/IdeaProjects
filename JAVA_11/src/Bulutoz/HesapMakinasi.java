package Bulutoz;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int sayi1,sayi2, secim;
        System.out.print("Ilk sayiyi giriniz : ");
        Scanner scan = new Scanner(System.in);
        sayi1 = scan.nextInt();
        System.out.print("\nIkinci sayiyi giriniz");
        sayi2 = scan.nextInt();
        System.out.println("\nLutfen yapmak istediginiz islemi seciniz :" );
        System.out.print("1- Toplama\n2- Cikarma\n3- Carpma\n4- Bölme");
        System.out.print("Seciminiz : ");
        secim = scan.nextInt();

        if (secim == 1){
            System.out.println("Toplama : " +(sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Cikarma : " + (sayi1-sayi2));
        } else if (secim == 3) {
            System.out.println("Carpma : " + (sayi1*sayi2));
        } else if (secim == 4) {
            if (sayi2 == 0){
                System.out.println("Ikinci sayi 0 a esittir ve sonuc belirsizdir !");
            }else{
                System.out.println("Bölme : " + (sayi1/sayi2));
            }

        }else{
            System.out.println("Gecersiz bir islem girdiniz tekrar deneyin !}");
        }

    }
}
