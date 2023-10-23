package pratik;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int num1 = scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");

        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
