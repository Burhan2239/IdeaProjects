package dersler.gun4;

public class MesafeHesapla {
    /*
    1-hiz degerini oku
    2-zaman degerini oku
    3-zaman ve hizi carp
    4-mesafeyi ekrana yaz
     */
    public static void main(String[] args) {
        int speedKm;
        int timeHr;
        int distanceKm;

        speedKm = 700;
        timeHr  = 4;
        distanceKm = speedKm * timeHr;

        System.out.println("Arabanin hizi           : " + speedKm);
        System.out.println("Gidilen süre(saat)      : " +timeHr);
        System.out.println("Toplam katedilen mesafe : " + distanceKm);
    }
}

