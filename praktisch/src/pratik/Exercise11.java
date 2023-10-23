package pratik;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cemberin yaricapini girin");
        double yaricap = scan.nextDouble();
        System.out.println("Cevresi = " + (2 * yaricap * Math.PI));
        System.out.println("Alani = " + (Math.PI * yaricap * yaricap));

    }
}
