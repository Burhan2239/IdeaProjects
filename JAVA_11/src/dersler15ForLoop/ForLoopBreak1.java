package dersler15ForLoop;

public class ForLoopBreak1 {
    public static void main(String[] args) {
        int rastgeleSayi = 1 + (int) (Math.random() * 100);

        for (int i = 0; i < 1000; i++) {
            if(rastgeleSayi == i) {
                System.out.println("Rastgele sayiyi buldum.");
                System.out.println("Rastgele sayi = " + rastgeleSayi);
                System.out.println("Döngünün i degeri : " + i);
                break;
            }
        }
    }
}
