package dersler14gun;

public class ForLoopRules {
    public static void main(String[] args) {
        System.out.println("For loop rules...");

        //Standart
        System.out.println("Döngü öncesi kod satırı.");
        for (int i = 0; i < 5; i++){
            System.out.println("Merhaba Java.");
        }
        System.out.println("Döngü sonrası kod satırı.");
        System.out.println();

        // 1-10 arası çift sayıları ekrana yazdıran for loop
        for (int i = 0; i<= 10 ;i+=2){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i<=10 ; i++){
            if(i%2==0) System.out.println(i);
        }
        System.out.println();

        //Değişken tanımı  ve değer ataması loop dışında olabilir
        int sayi = 0;
        for ( ;sayi<10 ; sayi++){
            System.out.println("Sayı : " + sayi);
        }
        System.out.println("Sayı değişkenin değerine loop dışından da erişilebilir.");
        System.out.println("Sayı(loop dışı) : " + sayi);
        System.out.println();

        //Değişkenin değerini döngünün içerisinde değiştirebiliriz.

        for (int i = 0; i < 10; ) {
            System.out.println("i : " + i);
            i++;
        }
        System.out.println();

        //Infinite loop--- sonsuz döngü
       /* for (;;){
            System.out.println("Sonsuz döngü");
        }
        */

        //Devam şartını döngü içerisinde belirlemek
        boolean devam = true;

        for (int sayac=0;devam;sayac++){
            if(sayac > 10){
                devam = false;
            }
            System.out.println("Sayac : " + sayac);
        }

        //Char type --- A-Z harflerini ekrana yazdıran for loop
        for (char harf = 'A'; harf <= 'Z'; harf++){
            System.out.print(harf + " ");
        }
        System.out.println();

        int satir = 1;
        for (char harf = 1; harf <= 65534; harf++, satir++){
            System.out.print(harf + "-" + (int)harf);
            if(satir%15 ==0) System.out.println(); //Satırda yazılacak harf sayısı
        }
        System.out.println();
        //1500 ile 2500 arası tek sayıları yazdıran for loop
        int numCounter = 0;
        for (int number = 1500 ; number < 2500; number++){
            if(number %2 == 1){
                System.out.println(number);
                numCounter++;
            }
        }
        System.out.println("1500-2500 arasında " + numCounter + " adet tek sayı vardır.");
    }
    }

