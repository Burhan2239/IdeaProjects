package dersler6gun;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +10;
        System.out.println("num1 = " + num1);

        int num2 = -100;
        System.out.println("num2 = " + num2);

        int sum = num1 + num2;
        System.out.println("sum = " + -sum); //-(-90) = +90

        System.out.println("sum = " + -(num1 + num2)); //-(+10 + -100) = = +90

        boolean b = false;
        System.out.println("b = " + b);
        System.out.println("!b = " + !b);
        System.out.println("!!b = " + !!b);

        int i=10;
        int j=5;

        i++;  // i = i+1;
        j--;  // j = j-1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        ++i; // i = i+1; // pre-increment
        --j; // j = j-1  //pre -decrement

        System.out.println("i = " + i); //12
        System.out.println("j = " + j); //3

        int x = 20;
        int y = 30;

        // degeri 1 artirir ve ayni islemde uygular

        System.out.println("x = " + ++x);  //21
        System.out.println("x = " + x);  //21

        // degeri 1 artiri ancak islemde eski deger kullanilir

        System.out.println("y = " + y++);  //30
        System.out.println("y = " + y);  //31

        int k = 10;
        int l = 40;

        System.out.println("k = " + --k); // 9
        System.out.println("k = " + k); // 9

        System.out.println("l = " + l--); // 40
        System.out.println("l = " + l); // 39




    }
}
