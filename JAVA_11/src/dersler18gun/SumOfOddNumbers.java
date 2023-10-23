package dersler18gun;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        //0 dan baslayarak verilen rakama kadar olan tek sayilarin toplamini bulunuz
        // Toplami cift sayilari disarida birakarak yapiniz
        int number = 0;
        int sum = 0;

        for (int i = 0; i <=number ; i++){
            if(i % 2 == 0){
                continue; //cift rakamlari atliyoruz
            }


            sum += i;    //7kalan tek rakamlari topluyoruz
        }
        System.out.println("sum = " + sum);
    }
}
