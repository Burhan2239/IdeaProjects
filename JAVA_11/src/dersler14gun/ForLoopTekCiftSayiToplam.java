package dersler14gun;

import java.util.Scanner;

public class ForLoopTekCiftSayiToplam {
    public static void main(String[] args) {
        //Klavyeden girilen sayı aralığındaki tek sayıların ve çift sayıların toplamını ekrana yazdıran programı yazınız.
        Scanner veriGir = new Scanner(System.in);
        int baslangicSayi = 0;
        int bitisSayi = 0;
        int tekSayiToplam = 0;
        int ciftSayiToplam = 0;

        System.out.print("Klavyeden başlangıç için bir tam sayı giriniz : ");
        baslangicSayi = veriGir.nextInt();
        System.out.print("Klavyeden bitiş için bir tam sayı giriniz     : ");
        bitisSayi = veriGir.nextInt();

        System.out.println(baslangicSayi + " sayısı ile " + bitisSayi + " sayısı arasında :");
        System.out.println();

        for (;baslangicSayi<=bitisSayi; baslangicSayi++){
            if (baslangicSayi %2 == 0){
                ciftSayiToplam += baslangicSayi;
            }else {
                tekSayiToplam += baslangicSayi;
            }
        }
        System.out.println("Tek sayıların toplamı = " + tekSayiToplam);
        System.out.println("Çift sayıların toplamı = " + ciftSayiToplam);

    }
    }

