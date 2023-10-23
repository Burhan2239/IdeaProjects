package dersler.gun4;

    public class Variables {
    /*
    Data Type   Size            Range
    byte        1 byte          Integers in the range of −128 to +127
    short       2 bytes         Integers in the range of −32,768 to +32,767
    int         4 bytes         Integers in the range of −2,147,483,648 to +2,147,483,647
    long        8 bytes         Integers in the range of −9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
    float       4 bytes         Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
    double      8 bytes         Floating-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy
    boolean     1 bit           true or false
     */

        public static void main(String[] args) {
            boolean evliMi;//true or false
            boolean gectiMi;
            byte siraNumarasi;
            short urunKategoriNo;
            int salary;
            long bankaMusterilerBakiyesi;//camelCase

            float kdvOrani;
            double buyukOndalikliBirSayi;

            //boolean dataType
            evliMi = true;
            gectiMi = false;

            System.out.println("Evli mi? : " + evliMi);
            System.out.println("Sini gecti mi? : " + gectiMi);

            //byte -128 ile +127
            siraNumarasi = 125;
            System.out.println("Sira numarasi : " + siraNumarasi);

            //short
            urunKategoriNo = 32000;
            System.out.println(urunKategoriNo);
            System.out.println("urunKategoriNo = " + urunKategoriNo);

            //int-
            salary = 2_000_000_000; //Büyük sayilari okunakli yapar ama gözükmez alt tire
            System.out.println("salary = " + salary);

            bankaMusterilerBakiyesi = 12_345_678_889_990_909L; //l or L to make it long
            System.out.println("bankaMusterilerBakiyesi = " +bankaMusterilerBakiyesi);

            ///float Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
            kdvOrani = 0.18f; // f or F for float dataTyp
            System.out.println("kdvOraNi = " + kdvOrani);
            kdvOrani = 342543246456454.23562366256546f;
            System.out.println("kdvOraNi = " + kdvOrani);

            //double Floating-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy

           buyukOndalikliBirSayi = 23443252345.2454554;
            System.out.println("buyukOndalikliBirSayi = " + buyukOndalikliBirSayi);




        }
    }

