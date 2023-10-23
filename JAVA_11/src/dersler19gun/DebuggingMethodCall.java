package dersler19gun;

public class DebuggingMethodCall {
    public static void main(String[] args) {

        System.out.println("Main method icerisinde - line 7");
        method();
        System.out.println("Main method icerisinde - line 9");
        method();
        System.out.println("Main method icerisinde - line 11");
        method();
        System.out.println("Main method icerisinde - line 13");


    }

    public static void method(){

        System.out.println("Method icerisinde - line 20");
        System.out.println("Method icerisinde - line 21");

    }
}
