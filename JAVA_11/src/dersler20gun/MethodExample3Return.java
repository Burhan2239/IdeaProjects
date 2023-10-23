package dersler20gun;

public class MethodExample3Return {
    public static int hesapla(int sayi1, int sayi2){
        int result = 0;
        result = sayi1 + sayi2;
        return result;
    }
    public static void main(String[] args) {
        int sonuc = 0;
        sonuc = hesapla(23,7); //sonuc = 30;

        System.out.println("sonuc = " + sonuc);
        System.out.println(hesapla(2,6));

        double doubleSonuc = hesapla(2,6);
        System.out.println("doubleSonuc = " + doubleSonuc);

        short shortVar = (short) hesapla(40000,5);
        System.out.println("shortVar = " + shortVar);
    }
}
