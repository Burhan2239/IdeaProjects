package dersler13gun;

public class OddEvenTernary {
    public static void main(String[] args) {

        // Write a ternary that check whether a number is odd or even
        // Bir sayinin tek mi cift mi oldugunu bulan bir ternary yaziniz

        int num = 13;
        String oddEven;

        // If Else
        if (num % 2 == 0) {
            oddEven = "Even number";
        } else {
            oddEven = "Odd number";
        }

        System.out.println("oddEven = " + oddEven);

        // Ternary
        oddEven = (num % 2 == 0) ? "Even number" : "Odd number";
        System.out.println("oddEven = " + oddEven);

        // Once sayinin positive olup olmadigi ni check ederek tek-cift karsilastirmasi yapalim

        if (num > 0) {
            oddEven = (num % 2 == 0) ? "Even number" : "Odd number";
        } else {
            oddEven = " Not a positive number";
        }

        System.out.println("oddEven = " + oddEven);
    }
    }
