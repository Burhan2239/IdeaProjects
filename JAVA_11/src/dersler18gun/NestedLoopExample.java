package dersler18gun;

public class NestedLoopExample {
    public static void main(String[] args) {

            outer:
            for(int i=1; i<=3; i++){
                System.out.println("Outer loop " + i);

                inner :
                for(int j=1; j<=3; j++){

                    if(j == 2){
                        continue outer;
                    }
                    System.out.println("Inner loop " + j);

                    if(i == 2){
                        break outer;
                    }
                }
            }
        }
}
