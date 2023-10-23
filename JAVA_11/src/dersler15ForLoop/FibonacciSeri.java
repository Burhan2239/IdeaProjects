package dersler15ForLoop;

public class FibonacciSeri {
    public static void main(String[] args) {
        //fibonacci 3-> 011
        //fibonacci 5 ->01123

        //kendisinden önceki 2 sayinin toplami kendisine esit olan sayi dizileri
        int sayi1 = 0;
        int sayi2 = 1;
        int toplam = 0;

        int fiboSayi = 5;

        // toplama = sayi1 + sayi2
        //sayi1=sayi2
        //sayi2 = toplam
        for (int i = 0; i <fiboSayi; i++){
            System.out.print(sayi1 + " ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;


        }

    }
}
