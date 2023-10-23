package dersler13gun;

public class IfElseToTernary {
    public static void main(String[] args) {

        int number = 24;

        // If Else
        if(number > 0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }

        // Ternary - % 99
        String result = (number > 0) ? "Positive Number" : "Negative Number";
        System.out.println(result);

        // Ternary icinde ayri statementlar hata verir
        // (number > 0) ? System.out.println("Positive Number") : System.out.println("Negative Number");

        // Ternary 2. yontem ancak cok kullanilan bir yontem degil - % 1
        System.out.println((number > 0) ? "Positive Number" : "Negative Number");

    }
}
