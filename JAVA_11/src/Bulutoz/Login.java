package Bulutoz;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String k_adi,parola;
        System.out.println("Kullanici adi griniz");
        k_adi = scan.nextLine();
        System.out.println("Parola Giriniz :");
        parola = scan.nextLine();
        if (k_adi.equals("java")&& parola.equals("123")){
            System.out.println("Basarili bir sekilde girdiniz !");
        }else {
            System.out.println("Kullanici adiniz veya parolaniz yanlis ! ");
        }
    }
}
