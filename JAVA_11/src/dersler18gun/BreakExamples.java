package dersler18gun;

public class BreakExamples {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){

            if(i==3){
                System.out.println("Hazir ol! Donguden cikiyoruz");
                break;
            }
            System.out.println("i = " + i);
            System.out.println("Block icindeyiz");
        }
        System.out.println("Blok disindayiz");
    }
}
