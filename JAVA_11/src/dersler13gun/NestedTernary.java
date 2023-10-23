package dersler13gun;

public class NestedTernary {
    public static void main(String[] args) {

        int x = 2;
        char ch;

        if(x > 2){
            if(x > 5){
                ch = 'A';
            }else{
                ch = 'B';
            }
        }else{
            ch = 'C';
        }

        System.out.println("ch = " + ch);

        ch = (x > 2) ? ((x > 5) ? 'A' : 'B') : 'C';

        System.out.println("ch = " + ch);

        // Buyuk rakami bul
        // Ikili karsilastirma

        int a = 8;
        int b = 5;

        int larger = (a > b) ? a : b;

        System.out.println("larger = " + larger);

        // Uclu karsilastirma

        int num1 = 15;
        int num2 = 12;
        int num3 = 24;

        //             (Condition)            (Expression 1)                  (Expression 2)
        //                             (Condition)    (Exp1) (Exp2)    (Condition)    (Exp1) (Exp2)
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("largest = " + largest);

    }
}
