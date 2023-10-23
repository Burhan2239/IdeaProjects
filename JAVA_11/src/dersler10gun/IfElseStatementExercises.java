package dersler10gun;

public class IfElseStatementExercises {
    public static void main(String[] args) {
        int age = 18;

        if(age >= 18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not eligible to Vote");
        }

        int radius = 15;
        double pi = 3.14;
        double area = 0;

        if(radius > 0){
            area = radius * radius * pi;
            System.out.println("Area = " + area);
        }else{
            System.out.println("This is not a circle");
            System.out.println("Area = " + area);
        }

        int number = 5;

        if(number >= 0){
            System.out.println(number + "is a positive number");

        }else{
            System.out.println(number + "is a negative number");
        }

        int sayi = 15;
        if (sayi % 2 == 0){
            System.out.println(sayi + "cift bir sayidir");
        }else{
            System.out.println(sayi + "tek bir sayidir");
        }

        int score = 80;
        double pay = 1000;

        if ( score > 90){
            pay += (pay * 3 /100);
        }else{
            System.out.println("pay = " + pay);
        }


    }
}
