package dersler17gun;

public class UniqueNumber {
    public static void main(String[] args) {
       int num1 = 1;
       int num2 = 2;
       int num3 = 3;

       int result = 0;

       if(num1 == num2 && num2 ==num3){
           result = 1;
       } else if (num1 == num2 || num1 == num3 || num2 == num3) {
           result = 2;
       }else {
           result = 3;
       }
        System.out.println("Count of unique number = " + result);

       //Ternary

       result = (num1 == num2 && num2 ==num3) ? 1 : (num1 == num2 || num1 == num3 || num2 == num3) ? 2 : 3;

        System.out.println("Count of unique number = " + result);

       }
    }
