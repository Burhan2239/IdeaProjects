package dersler14gun;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i < 20;i++){
            System.out.println("Merhaba for loop.");
        }

        for (int tekrar = 1; tekrar <= 5; tekrar++) {
            System.out.println(tekrar + "-Merhaba Java.");
        }

        //Ekrana 1-10 arası sayıları yazan bir for loop kodunu yazınız?
        for (int sayi = 1; sayi <= 10; sayi++){
            System.out.println(sayi);
        }
        System.out.println();

        //Ekrana 10-1 arası sayıları yazan bir for loop kodunu yazınız?
        for(int sayi = 10; sayi >= 1; sayi--){
            System.out.println(sayi);
        }
        System.out.println();

        //Ekrana 1 - 10  arası çift sayıları yazan bir for loop kodunu yazınız?
        for(int sayi = 1; sayi <= 10; sayi++){
            System.out.println("Sayı : " + sayi);
            if(sayi %2 ==0){
                System.out.println("Çift sayı : " + sayi);
            }
        }
        System.out.println();
        int counter = 1;
        for (int sayi = 0; sayi <= 10; sayi+=2 ){ //sayi = sayi + 2
            System.out.println("Counter : " + counter);
            System.out.println("Çift sayı : " + sayi);
            counter++;
        }
    }
}