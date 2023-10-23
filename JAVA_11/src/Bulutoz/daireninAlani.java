package Bulutoz;

import java.util.Scanner;

public class daireninAlani {
    public static void main(String[] args) {
        int r;
        double alan,hacim, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapi giriniz : \n");
        r = input.nextInt();
        alan = 2 * pi * r ;
        hacim = pi * (r*r);
        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin hacmi : " + hacim);
    }
}
