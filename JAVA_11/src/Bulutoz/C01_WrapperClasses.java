package Bulutoz;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.toUpperCase());

        int sayiP= 20;

        Integer sayiW= 30;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        char karekP= 'a';
        Character karekW= 'b';

        System.out.println(Character.isDigit(karekP));
        System.out.println(Character.isLowerCase(karekP));

        String str2="1234";
        String str3="1000";

        System.out.println(str2+str3);

        System.out.println(Integer.valueOf(str2)+ Integer.valueOf(str3));


    }
}
