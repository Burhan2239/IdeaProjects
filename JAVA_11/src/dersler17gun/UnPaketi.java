package dersler17gun;

public class UnPaketi {
    public static void main(String[] args) {
        int beslikPaketSayisi=3;
        int birlikPaketSayisi = 5;
        int talep = 28;
        boolean sonuc = false;

        if(beslikPaketSayisi + 5 >= talep){
            if(birlikPaketSayisi >=  talep % 5)
                sonuc = true;

        }else{
            if(birlikPaketSayisi >= talep - beslikPaketSayisi +5){
                sonuc = true;
            }
        }
        if(sonuc){
            System.out.println(talep + "kilo talep karsilanabilir");

            }else{
            System.out.println(talep + " talep karsilanamaz");
        }
    }
}
