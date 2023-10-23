package dersler15ForLoop;

public class ForLoopCarpimTablosu {
    public static void main(String[] args) {
        System.out.println("Nested(ic-ice) for loop ile");
        System.out.println("1'den 10'a kadar olan sayilarin carpim tablosu");
        System.out.println("------------------------");

        for (int sayi = 1; sayi <= 10; sayi++) {

            if(sayi == 6 || sayi == 9 || sayi ==10){
                System.out.println(sayi + "larin carpim tablosu");
            }else System.out.println(sayi + "lerin carpim tablosu");

            System.out.println("------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.println(sayi + "*" + i + "=" + (sayi * i));
            }
            System.out.println("------------------------");
        }
        }
    }