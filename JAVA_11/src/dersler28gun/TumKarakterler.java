package dersler28gun;

import java.util.Scanner;

public class TumKarakterler {
    public static void main(String[] args) {

        // Kullanicidan aldigimiz bir stringin tum karakterlerini
        // yazdiran bir method yaziniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = sc.nextLine();
        tumKarakter(str);
    }

    public static void tumKarakter(String s){
        for(int i=0; i <= s.length()-1; i++){
            System.out.println(s.charAt(i));
        }
    }
}
