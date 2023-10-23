package Bulutoz;

import java.util.Scanner;

public class ForAsalSayi {
    public static void main(String[] args) {
        //asal sayi bulma
        Scanner scan = new Scanner(System.in);
        int input;
        boolean asal =  true;
        do {
            System.out.print("Lütfen pozitif bir sayi giriniz : ");
            input = scan.nextInt();
        }while (input < 2);

        for (int i = 2; i < input; i++){
            if(input%i==0) {
                asal = false ;
                break;
            }
        }
        if(asal) {
            System.out.print("Girilen sayi : " + input + " asaldir.");
        }else {
            System.out.print("Girilen sayi : " + input + " asal degildir. ");
        }
    }
}
