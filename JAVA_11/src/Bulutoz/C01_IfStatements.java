package Bulutoz;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi % 5 == 0){
            System.out.println("Girilen sayi 5'in tam kati");
        }

    }
}
