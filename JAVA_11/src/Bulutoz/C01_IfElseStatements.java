package Bulutoz;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini girin, " + "her kenardan sonra " + "enter a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else{
            System.out.println("Eskenar ucgen degil");
        }
    }
}
