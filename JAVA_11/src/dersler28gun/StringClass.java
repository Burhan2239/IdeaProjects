package dersler28gun;

public class StringClass {
    public static void main(String[] args) {

        // String 2 farkli yontem ile olusturulur

        // 1. Yontem - String Literal
        String s = "Hello";
        System.out.println("s = " + s);

        // 2. Yontem - new keyword
        String s2 = new String("Hello");
        System.out.println("s2 = " + s2);

        // '==' operator kullanarak String karsilastirma
        // '==' operator String karsilastirmasi yaparken object degerlerini degil
        // ayni objecti refere edip etmedigini karsilastiriyor

        String str1 = new String("EurotechStudy");
        String str2 = "EurotechStudy";
        String str3 = "EurotechStudy";
        String str4 = new String("EurotechStudy");

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // false
        System.out.println(str2 == str3); // true // sadece str2 ve str3 String Pool da ayni objecti refere ediyor
        System.out.println(str2 == str4); // false
        System.out.println(str3 == str4); // false
    }
}
