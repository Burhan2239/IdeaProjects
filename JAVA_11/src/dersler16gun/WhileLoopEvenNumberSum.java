package dersler16gun;

public class WhileLoopEvenNumberSum {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;

        while(number < 100){
            if(number % 2 == 0){
                sum += number; //sum = sum + number
            }


            number++;
        }

        System.out.println("Sum of EVEN numbers are : " + sum);
        sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){

            }
        }
        System.out.println("Sum of EVEN numbers are(for loop)");
    }
}
