package dersler17gun;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age = 34;
        String personType = "";

        if(age >= 0 && age<= 2){
            personType = "Bebek";
        }else if(age >= 3 && age <= 13){
            personType = "Cocuk";
        }else if(age >= 14 && age <= 18) {
            personType = "Genc";
        }else if(age >= 19 && age <= 50) {
            personType = "Yetiskin";
        }else if(age > 50) {
            personType = "Yasli";
        }
        System.out.println("personType = " + personType);

    }
}
