package dersler26gun;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Random class -- generating random numbers.");
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        for (int i = 1; i <= 10; i++) {
            int randomInt1 = random.nextInt(10); //0 ile < 10 arasınad rastgele bir tamsayı üretir.
            System.out.println("randomInt1 = " + randomInt1);
        }
        System.out.println();

        int start = 10;
        int end = 100;
        for (int i = 1; i <= 10; i++) {
            int randomInt2 = random.nextInt(start,end); // belirlenen aralıkta rastgele sayı üretir. Başlangıç değeri dahil bitiş değeri hariçtir.
            System.out.println("randomInt2 = " + randomInt2);
        }

        System.out.println();
        System.out.println(".nextDouble()---> 0.0 - 1.0");
        double randomDouble1 = random.nextDouble();
        System.out.println("randomDouble1 = " + randomDouble1);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            double randomDouble2 = random.nextDouble(10);
            System.out.println("randomDouble2 = " + randomDouble2);
        }

        System.out.println();
        System.out.println(".nextBoolean()");
        boolean varYok = random.nextBoolean();
        System.out.println("varYok = " + varYok);

        //Generating random numbers in given range. low is inclusive high is exclusive
        int low = 5;
        int high = 10;

        for (int i = 0; i < 10; i++) {
            int result = random.nextInt(high-low) + low;
            System.out.println("result = " + result);
        }

    }
}
