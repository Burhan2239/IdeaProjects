package dersler15ForLoop;

public class PrintingChars {
    public static void main(String[] args) {
        for ( int i = 0; i<65535; i++) {
            System.out.println(i + "->" + (char) i + " ");
            System.out.println();
        }
    }
}
