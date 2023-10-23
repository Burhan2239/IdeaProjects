package dersler18gun;

public class PrimeNumber {
    public static void main(String[] args) {

        // Verilen bir sayinin asal sayi olup olmadigini tespit eden bir program yaziniz

        int number = 197;
        boolean isPrime = true;

        if(number < 2){
            isPrime = false;
        } else{
            for(int i=2; i<number; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(number + " is a Prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
    }
}
