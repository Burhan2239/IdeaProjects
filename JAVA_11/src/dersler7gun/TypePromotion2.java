package dersler7gun;

public class TypePromotion2 {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 1.26f;
        double d = 205.65;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);
        int result2 = (int) result;
        System.out.println("result2 = " + result2);

        //////////

        int i2 = 5;
        float f2 = 15.5f;
        long l2 = 13133131319348l;
        double d2 = 26.4;

        float result3 = i2 * f2;
        long result4 = l2 - i2;
        double result5 = d2 + f2;

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);



    }
}
