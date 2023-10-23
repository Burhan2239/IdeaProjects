package dersler14gun;

import java.util.Scanner;

public class ForLoopSayiTahminOyunu {
    public static void main(String[] args) {
        Scanner tahmin = new Scanner(System.in);
        System.out.println("For loop ile sayı tahmin oyunu");
        System.out.println("------------------------------");

        int maxTahminSayisi = 6;
        System.out.println("En fazla " + maxTahminSayisi + " tahmin hakkınız var.");
        System.out.println();

        int tahminSayi = 0;
        int rastgeleSayi = 1 + (int) (Math.random()*10); // 1-10 arası rasgele sayı üretir.

        //System.out.println("Rastgele sayı : " + rastgeleSayi);

        boolean dogruCevap = true;

        for(int i = 1; i <= maxTahminSayisi && dogruCevap ;i++){
            System.out.print("Tahminizi giriniz : ");
            tahminSayi = tahmin.nextInt();
            if(tahminSayi == rastgeleSayi){
                System.out.println("Tebrikler " + i + " tahminde bildiniz.");
                dogruCevap = false;

            }else{
                System.out.println("Malesef tahmininiz yanlış!!!");
                /*
                if((maxTahminSayisi - i) > 0 ){
                    System.out.println((maxTahminSayisi - i) + " tahminiz kaldı!!");
                }*/
                //Ternary versiyonu
                String mesaj = (maxTahminSayisi - i == 0)?"" : (maxTahminSayisi-i) + " tahminiz kaldı!";
                System.out.println(mesaj);
            }
        }
        System.out.println("Tuttuğum sayı : " + rastgeleSayi);
    }
}
