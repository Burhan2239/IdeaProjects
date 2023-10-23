package dersler6gun;

public class PrecedenceVSAssociativity {
    public static void main(String[] args) {
        //Java matematiktki islemleri yapiyor
        System.out.println(3+5*7);
        System.out.println(42-15/3);
        System.out.println(8+2*3-21/7+6);
        System.out.println(4+42/2*3);
        System.out.println(6-3*3+6-8);

        System.out.println( 3+4*4+5*(4+3)-1);
        System.out.println( 3+4*4+5*(4+(3+2)-1));
    }
}
