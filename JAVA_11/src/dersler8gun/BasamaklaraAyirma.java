package dersler8gun;

public class BasamaklaraAyirma {
    public static void main(String[] args) {
        int sayi = 2345;
        int birler=0,onlar=0,yuzler=0,binler=0;


        System.out.println("Basamaklara ayirma...");
        System.out.println("---------------------");

        System.out.println("Sayi : " + sayi);
        birler = sayi % 10;
        sayi /= 10;

        System.out.println("Sayi : " + sayi);

        onlar = sayi % 10;
        sayi /= 10;

        yuzler = sayi % 10;
        sayi /= 10;

        binler = sayi % 10;
        sayi /= 10;

        System.out.println("Basamaklara ayrilan sayi : " + sayi);
        System.out.println("Birler : " + birler);
        System.out.println("Onlar : " + onlar);
        System.out.println("Yuzler : " + yuzler);
        System.out.println("Binler : " + binler);
    }
}
