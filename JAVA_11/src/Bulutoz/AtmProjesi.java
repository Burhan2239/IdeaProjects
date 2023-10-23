package Bulutoz;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        int bakiye = 1000, input,miktar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Merhabalar Kodlama Banka Hosgeldiniz !");
        System.out.println("Güncel Bakiyeniz : " + bakiye + "TL");

        while (bakiye >0){
            System.out.println();
            System.out.println("1-) Para Yatir");
            System.out.println("2-) Para Cek");
            System.out.println("3-) Bakiye Sorgulama");
            System.out.println("4-) Cikis Yap");
            System.out.println("Yapmak istediginiz Islemi Seciniz : ");
            input = scan.nextInt();
            
            if(input  == 1){
                System.out.print("Yatirmak istediginiz miktar :");
                miktar = scan.nextInt();
                bakiye += miktar;
            } else if (input ==2) {
                System.out.print("Cekmek istediginiz miktar :");
                miktar = scan.nextInt();
                if(miktar >bakiye){
                    System.out.println("Yetersiz Bakiye !!");
                }else{
                    bakiye -= miktar;
                }
            } else if (input == 3) {
                System.out.println("Güncel Bakiyeniz : " + bakiye + "TL");
            } else if (input == 4) {
                System.out.println("Cikis yapiliyor !1");
                break;
            }else {
                System.out.println("Gecersiz bir islem girdiniz !");
            }
        }
        System.out.println("Tekrar Bekleriz !");

    }
}
