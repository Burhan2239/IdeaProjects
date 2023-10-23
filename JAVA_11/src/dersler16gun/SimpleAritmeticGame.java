package dersler16gun;

import java.util.Scanner;

public class SimpleAritmeticGame {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int soruSayisi = 0;
    int cevap = 0;
    int yanlisCevapSayisi = 0;
    int dogruCevapSayisi = 0;

        System.out.print("Kac adet soru olusturmami istersin ?");
        soruSayisi = input.nextInt();

        int counter = 0;

        while (counter < soruSayisi){
            int sayi1 = (int) (Math.random() * 10 +1);
            int sayi2 = (int) (Math.random() * 10 +1);
            counter++;

            System.out.println(counter + ". soru ---> " + sayi1 + "+" + sayi2 + " = ");
            System.out.println("Cevabiniz --> ");
        }
    }
}
