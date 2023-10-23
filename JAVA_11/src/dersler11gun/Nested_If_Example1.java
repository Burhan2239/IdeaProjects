package dersler11gun;

import java.util.Scanner;

public class Nested_If_Example1 {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        int age,weight;
        age = 0;
        weight = 0;

        System.out.println("Lütfen yaşınızı giriniz : ");
        age = veriGir.nextInt();

        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = veriGir.nextInt();

        if((age >= 18) && (age <= 70) ){
            System.out.println("Yaşınız 18'den büyük...");
            if ((weight >= 50) && (weight <= 350)) {
                System.out.println("Yaşınız ve kilonuz kan vermeye uygundur.");
            }else System.out.println(age + " yaşındasınız ve " + weight + " kilodasınız. " +
                    "Yaşınız uygun ancak kilonuz kan vermeye uygun değilidr!!!");
        }else System.out.println(age  + " yaşındasınız ve yaşınız kan vermeye uygun değildir!!!");
    }
}
