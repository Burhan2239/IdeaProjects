package Bulutoz;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        //kullanicadan bir sayi alin
        //sayi 3 ile bolunuyorsa uc ile bolunebilen
        //5 ile bolunebiliyorsa bes ile bolunebilen sayi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi % 3 == 0){
            System.out.println("uc ile bolunme kontrol sonucu olumlu");
            System.out.println("Uc ile bolunebilen sayi");
        }
        if (girilenSayi % 5 == 0){
            System.out.println("bes ile bolunme kontrol sonucu olumlu");
            System.out.println("bes ile bolunebilen sayi");
        }

    }
}
