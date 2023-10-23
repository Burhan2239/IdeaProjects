package dersler20gun;

public class MethodExample2 {
    public static void hesapla(int num1, int num2){
        int toplam = 0;
        toplam = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + toplam);
    }

    public static void main(String[] args) {
        byte byteVar = 124;
        short shortVar = 32500;
        double doubleVar = 12174627834687326.6324526;
        hesapla(2,5);
        hesapla(23,12);
        hesapla(344,56);

        hesapla(byteVar,shortVar);
        hesapla(shortVar,(int) doubleVar);
    }
}
