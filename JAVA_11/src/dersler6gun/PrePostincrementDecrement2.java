package dersler6gun;

public class PrePostincrementDecrement2 {
    public static void main(String[] args) {
        int x = 50;
        int y = --x + x++ + x-- + x++;

        System.out.println("x = " + x); //
        System.out.println("y = " + y); //
    }
}
