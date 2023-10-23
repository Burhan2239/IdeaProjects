package dersler16gun;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            //Point A
            System.out.println("Point A ->" + (count<10));
            System.out.println(count + ". Welcome to Java.");
            count++;

            System.out.println("Point B->" + (count<10));
            System.out.println("count : " + count);
        }
        //Point C
        System.out.println("Point C ->" + (count<10));
    }
}
