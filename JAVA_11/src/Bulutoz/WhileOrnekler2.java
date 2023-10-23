package Bulutoz;

import java.util.Scanner;

public class WhileOrnekler2 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyel sayisi giriniz");
        int f = scan.nextInt();
        int sonuc = 1;
        while (f>0){
            sonuc *=f;
            f--;
        }
        System.out.print(sonuc);

         */
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();
        int i = 1;
        while (i <= star) {
            int k = i;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
