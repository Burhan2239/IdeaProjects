package dersler26gun;
import java.util.Random;

    public class RandomExercise {
        //Write code that generates a random odd integer (not divisible by 2) between 50 and 99 inclusive.

        public static int rastgeleTekSayiUret(int low, int high) {
            Random rastgele = new Random();
            int result = 0;
            if (low < high) {
                while (true) {
                    result = rastgele.nextInt(high + 1 - low) + low;
                    if (result % 2 != 0) {
                        break;
                    }
                }
            }
            return result;
        }

        public static void rastgeleTekSayiUret(int low, int high, int numbers) {
            if (low < high) {
                for (int i = 1; i <= numbers; i++) {
                    System.out.println(i + ".sayı = " + rastgeleTekSayiUret(low, high));
                }
            } else System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz!!!");

        }

        public static void main(String[] args) {
            int altSinir = 50;
            int ustSinir = 99;

            int rastgeleTekSayi = rastgeleTekSayiUret(50, 99);
            System.out.println("rastgeleTekSayi = " + rastgeleTekSayi);

            rastgeleTekSayiUret(500, 99, 10);

        }
    }


