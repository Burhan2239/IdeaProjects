package dersler15ForLoop;

public class NestedForLoopsNumberTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i =1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = rows; i > 0; i--){
            for (int j =1; j <= i ; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
