package pratik;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num1 = scan.nextInt();
        System.out.println("Lütfen bir sayi giriniz");
        int num2 = scan.nextInt();
        System.out.println("Lütfen bir sayi giriniz");
        int num3 = scan.nextInt();
        System.out.println("Ortalama :" + (num1+num2+num3) / 2);
    }
}
