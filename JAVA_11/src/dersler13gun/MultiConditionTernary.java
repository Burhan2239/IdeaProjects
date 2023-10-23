package dersler13gun;

public class MultiConditionTernary {
    public static void main(String[] args) {
        String ogrenci = "Ahmet";
        int diplomaNotu = 70;
        int sinavSonucu = 55;
        String kayitSonucu;

        kayitSonucu = (diplomaNotu > 70 && sinavSonucu > 85) ? "ogrencinin kaydi kabul edilmistir" : "ogrencinin kaydi kabul edilmemistir ";
        System.out.println(ogrenci + " isimli " + kayitSonucu);
    }
}
