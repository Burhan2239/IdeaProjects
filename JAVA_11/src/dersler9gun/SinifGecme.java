package dersler9gun;

public class SinifGecme {
    public static void main(String[] args) {
        System.out.println("Sınıf Geçme Notu Hesaplama Programı...");
        String name = "Ahmet Falanca";
        int vize1 = 75;
        int vize2 = 75;
        int finalNotu = 80;
        double sinifGecmeNotu = 0;
        boolean gectiMi = false;
        boolean A_ileMiGecti = false;
        boolean B_ileMiGecti = false;
        boolean C_ileMiGecti = false;
        boolean D_ileMiGecti = false;
        boolean F_ileMiGecti = false;

        sinifGecmeNotu = ((vize1 * 0.2) + (vize2 * 0.2)) + (finalNotu * 0.6);

        System.out.println("sinifGecmeNotu = " + sinifGecmeNotu);

        //Relational(Karşılaştırma) operatörü ile implement edilmiş hali
        // gectiMi = sinifGecmeNotu >= 50;

        //Logical operator ile implement edilmiş hali
        gectiMi = sinifGecmeNotu == 50 || sinifGecmeNotu > 50;
        A_ileMiGecti = sinifGecmeNotu >= 80 && sinifGecmeNotu <=100;
        B_ileMiGecti = sinifGecmeNotu >= 70 && sinifGecmeNotu < 80;
        C_ileMiGecti = sinifGecmeNotu >= 60 && sinifGecmeNotu <70;
        D_ileMiGecti = sinifGecmeNotu >= 50 && sinifGecmeNotu <60;
        F_ileMiGecti = sinifGecmeNotu < 50;

        System.out.println(name + " adli öğrencinin 1.Vize notu    = " + vize1);
        System.out.println(name + " adli öğrencinin 2.Vize notu    = " + vize2);
        System.out.println(name + " adli öğrencinin Final notu     = " + finalNotu);
        System.out.println(name + " adli öğrencinin hesaplanan not = " + sinifGecmeNotu);
        System.out.println();
        System.out.println(name + " adlı öğrencinin sınıf geçme durumu : " + gectiMi);

        System.out.println("A notu ile mi geçti ? " + A_ileMiGecti);
        System.out.println("B notu ile mi geçti ? " + B_ileMiGecti);
        System.out.println("C notu ile mi geçti ? " + C_ileMiGecti);
        System.out.println("D notu ile mi geçti ? " + D_ileMiGecti);
        System.out.println("F notu ile mi kaldı " + F_ileMiGecti);

    }
}
