package dersler11gun;


import java.util.Scanner;

public class OgrenciSinifGecme {
        public static void main(String[] args) {
            Scanner veriGir = new Scanner(System.in);
            System.out.println("Klavyeden girilen ders notuna göre sınıf geçme notunu ekrana yazdıran program.");
            System.out.println("------------------------------------------------------------------------------");
            int dersNotu = 0;
            char gecmeNotu = 'F';

            System.out.print("Ders notunuzu giriniz : ");
            dersNotu = veriGir.nextInt();;

            if(dersNotu >= 0 && dersNotu <= 100 ){
                if(dersNotu >= 90) {
                    //System.out.println("Ders geçme notunuz -A-");
                    gecmeNotu = 'A';
                }
                else if (dersNotu >= 80) {
                    //System.out.println("Ders geçme notunuz -B-");
                    gecmeNotu = 'B';
                }
                else if (dersNotu >= 70){
                    //System.out.println("Ders geçme notunuz -C-");
                    gecmeNotu = 'C';
                }
                else if (dersNotu >= 60){
                    //System.out.println("Ders geçme notunuz -D-");
                    gecmeNotu = 'D';
                }
                else if (dersNotu >= 50) {
                    // System.out.println("Ders geçme notunuz -E-");
                    gecmeNotu = 'E';
                }
                else {
                    // System.out.println("Ders geçme notunuz -F-");
                    // System.out.println(dersNotu + " ile sınıfta kaldınız!!!");
                    gecmeNotu = 'F';
                }
                if(gecmeNotu == 'F'){
                    System.out.println("Ders geçme notunuz = " + gecmeNotu);
                    System.out.println(dersNotu + " ile sınıfta kaldınız!!!");
                } else {
                    System.out.println("Ders geçme notunuz = " + gecmeNotu);
                    System.out.println("Tebrikler " + dersNotu + " ile sınıfı geçtiniz");
                }
            }else System.out.println("Hatalı bir ders notu girdiniz.");
        }
}
