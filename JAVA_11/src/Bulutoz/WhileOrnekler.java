package Bulutoz;

import java.util.Scanner;

public class WhileOrnekler {
    public static void main(String[] args) {
       /* int i = 1;
        while (i <= 100){
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int input;
        while (true){
            System.out.print("Lütfen sayi giriniz : ");
            input = scan.nextInt();
            if(input < 0 ){
                System.out.print("Program bitti negatif sayi girdiniz! !");
                System.out.print("girilen tek sayilar toplami : " + toplam);
                break;

            }
            if (input % 2==1){
                //toplam = toplam + input;
                toplam += input;
            }
        }
    }
}
