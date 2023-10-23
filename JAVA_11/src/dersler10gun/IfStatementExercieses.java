package dersler10gun;

public class IfStatementExercieses {

public static void main(String[] args) {

        // Which of the following if statement headers uses the correct syntax

        int x = 10;
        int y = 5;
        // if (x equals 42){ } - hata
        // if x = 10 then { } - hata
        // if (x == y) { } - dogru
        // if (x => y) { } - hata
        // if [x ==10] { } - hata

        // Write an if statement that multiplies salary by 1.5 if hours is greater than 38
        // Eger calisma saati 38 den buyuk ise maasi 1.5 ile carpan bir if statement yaziniz

        double salary = 5000;
        int hours = 39;

        if (hours > 38) {
        salary *= 1.5;
        }

        System.out.println("Toplam odenen maas = " + salary);

        // Write an if statement that assigns 1 to x if y is greater than 0
        // Eger y sifirdan buyuk ise x e 1 degerini atayan bir if statement yaziniz

        int x2 = 0;
        int y2 = 5;

        if (y2 > 0){
        x2 = 1;
        }

        System.out.println("x2 = " + x2);

        // Write an if statement that increases pay by 3% if score is greater than 90
        // Eger score 90 dan buyuk ise odemeyi %3 arttiran bir if statement yaziniz

        int score = 100;
        int pay = 1000;

        if (score > 90){
        pay += (pay * 3 / 100);
        }

        System.out.println("pay = " + pay);

        }
        }