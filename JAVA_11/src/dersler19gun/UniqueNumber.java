package dersler19gun;

public class UniqueNumber {
    public static void main(String[] args) {

        // 3 sayi icerisinde kac farkli sayi oldugunu tespit eden bir method yaziniz
        uniqueNumber();

    }

    public static void uniqueNumber(){

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int result = 0;

        if(num1 ==num2 &&num2 ==num3) {
            result = 1;
        }else if(num1 ==num2 ||num2 ==num3 ||num1 ==num3) {
            result = 2;
        }else {
            result = 3;
        }

        System.out.println("Count of unique number = "+result);
    }
}
