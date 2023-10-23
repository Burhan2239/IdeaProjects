package Bulutoz;

import java.util.Scanner;

public class DoWhilleOrnekler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* int input, toplam = 0;
        while (true) {
            System.out.print("Lütfen Sayi Giriniz : ");
            input = scan.nextInt();
            if (input < 0 ) {
                System.out.println("Program Bitti Negatif Sayi Giriniz !! ");
                break;
            }
            if (input % 2 ==1){
                toplam += input;
                System.out.println("girilen tek sayilar toplami : " + toplam);
            }
        }

        */

        int input, toplam=0;
        do{
            System.out.print("lütfen sayiyi giriniz : ");
            input = scan.nextInt();
            if(input%2==0){
                toplam += input;

            }
        }while (input>0);
        System.out.println("girilen tek sayilar toplami : " + toplam);
    }
}
