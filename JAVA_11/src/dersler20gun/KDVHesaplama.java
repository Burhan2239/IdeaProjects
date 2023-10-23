package dersler20gun;

public class KDVHesaplama {
    public static void kdvHesapla(String urunAd, int miktari, double fiyat) {
        double kdvliFiyat = (miktari * fiyat) * 1.18;
        System.out.println(urunAd + "-" + miktari + "-" + kdvliFiyat);
    }

    public static void kasaBaslik() {
        System.out.println("EuroTech Market");
        System.out.println("------------------");
        System.out.println("İyi alışverişler dileriz.");
        System.out.println();
    }

    public static void kasaAltlik() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
        System.out.println("Tekrar alışveriş için bekleriz.");
    }

    public static void main(String[] args) {
        String urun = "Elma";
        int miktar = 3;
        double fiyati = 15;

        kasaBaslik();
        kdvHesapla(urun, miktar, fiyati);
        kdvHesapla("Peynir", 1, 185);
        kdvHesapla("Zeytin", 2, 90);
        kdvHesapla("Ekmek", 2, 7.5);
        kdvHesapla("Karpuz", 5, 5.95);
        kdvHesapla("Deterjan", 1, 179);
        kdvHesapla("Diş macunu", 2, 120);
        kasaAltlik();

    }
}
