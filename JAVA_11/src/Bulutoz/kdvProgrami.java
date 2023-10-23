package Bulutoz;

import java.util.Scanner;

public class kdvProgrami {
    public static void main(String[] args) {
        double tutar , kdvliFiyat;
        double kdv = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün tuttarini Giriniz");
        tutar = input.nextDouble();
        kdvliFiyat = tutar  + (tutar*kdv);
        System.out.println("Ürünün KDV`li Fiyati : " + kdvliFiyat);

    }
}
