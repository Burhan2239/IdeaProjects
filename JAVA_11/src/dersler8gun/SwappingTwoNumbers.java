package dersler8gun;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Swapping Two Numbers...");
        System.out.println("-----------------------");

        int sayiA = 12;
        int sayiB =33;


        //1.Cözüm 3.bir degisken kullanarak
        System.out.println("1.Cözüm");
        System.out.println("Values of numbers before swapping...");
        System.out.println("Sayi A = " + sayiA);
        System.out.println("Sayi B = " + sayiB);
        int temp = 0;

        temp = sayiA;
        sayiA = sayiB;
        sayiB = temp;



        //2.Cözüm bir baska degisken kullanmadan
        System.out.println("2.Cözüm");
        System.out.println("Values of numbers before swapping...");
        System.out.println("Sayi A = " + sayiA);
        System.out.println("Sayi B = " + sayiB);

        sayiA = 12;
        sayiB = 33;


    }
}
