package dersler7gun;

public class ExplicitCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;//Explicit Casting-Manual Coversion
        double myDouble2 = myInt;


        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt '= " + myInt);
        System.out.println("myDouble2 = " + myDouble2);

        double d = 100.4;
        long l = (long) d; // Explicit casting - Data kaybi sozkonusu
        int i = (int) l;   // Explicit casting - Data kaybi soz konusu degil ancak yine de operatore ihtiyac var

        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);

    }
}
