package Bulutoz;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='o'  || ilkHarf=='O'){
            System.out.println("Ocak");
        }
        if (ilkHarf=='s'  || ilkHarf=='S'){
            System.out.println("Subatk");
        }if (ilkHarf=='m'  || ilkHarf=='M'){
            System.out.println("Mart");
        }if (ilkHarf=='n'  || ilkHarf=='N'){
            System.out.println("Nisan");
        }if (ilkHarf=='m'  || ilkHarf=='M'){
            System.out.println("Mayis");
        }if (ilkHarf=='h'  || ilkHarf=='H'){
            System.out.println("Haziran");
        }if (ilkHarf=='t'  || ilkHarf=='T'){
            System.out.println("Temmuz");
        }if (ilkHarf=='a'  || ilkHarf=='A'){
            System.out.println("Agustos");
        }
    }
}
