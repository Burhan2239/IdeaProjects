package dersler13gun;

public class AbsoluteValue {
    public static void main(String[] args) {
        //Bir sayinin mutlak degerini dogru olarak gösteren ternary yaziniz

        int number = 10;
        int absoluteValue;

        absoluteValue = (number > 0) ?number : -number;

        System.out.println("absoluteValue = " + absoluteValue);
    }
}
