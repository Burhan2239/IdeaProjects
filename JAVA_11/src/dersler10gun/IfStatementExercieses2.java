package dersler10gun;

public class IfStatementExercieses2 {
    public static void main(String[] args) {
         int sayi = 20;

         if (sayi%5 == 0){
             System.out.println("Hi Five");
         }
         if(sayi%2 == 0){
             System.out.println("Hi Even");
         }


         int age = 18;

         if(age >= 18){
             System.out.println("Eligible to vote");
         }

         int num1 = 10;
         int num2 = 5;
         int num3 = 15;

         if(  num1 > num2 && num1 > num3 ){
             System.out.println(num1 + " is the greatest number");
         }
        if( num2 > num1 && num2 > num3   ){
            System.out.println(num2 + " is the greatest number");
        }
        if(  num3 > num1 && num3 > num2 ){
            System.out.println(num3 + " is the greatest number");
        }

        int personAge = 25;
         boolean isStudent = true;

         if(personAge >= 18 && personAge <= 30 && isStudent){
             System.out.println("You are eligible for a discount");
         }else{
             System.out.println("You are not eligible for a discount");
         }



    }
}
