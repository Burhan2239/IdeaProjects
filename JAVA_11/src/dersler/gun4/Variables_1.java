package dersler.gun4;

public class Variables_1 {
    public static void main(String[] args) {
        System.out.println("Variables in Java Programming Language.");
        System.out.println("---------------------------------------");


        System.out.println("Adi     : Ahmet");
        System.out.println("Sinif   : C");
        System.out.println("Okul no : 1245");

        System.out.println("Adi     : Mehmet");
        System.out.println("Sinif   : C");
        System.out.println("Okul no : 1245");
        //Variable declaration
        //dataType variableName

        String name; //Declare to create String type
        char sube;
        short okulNo;

        name = "Hasan"; //String dataType
        sube = 'C'; //character dataType
        okulNo = 8654; //short dataType  ---> -32768 ile 32767

        System.out.println(name);
        System.out.println(sube);
        System.out.println(okulNo);

        System.out.println();
        System.out.println("Name    : " + name);
        System.out.println("Okul    : " + sube);
        System.out.println("Okul No : " + okulNo);

        System.out.println();
        name = "Ayse";
        sube = 'A';
        okulNo = 1234;

        System.out.println();
        System.out.println("Name    : " + name);
        System.out.println("Okul    : " + sube);
        System.out.println("Okul No : " + okulNo);

    }
}
