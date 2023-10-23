package dersler19gun;

public class Google {
    public static void main(String[] args) {

        // Google a git
        // Arama yap
        // Urunu bul ve sitesine git
        // Urunu sepete ekle
        // Odeme yap
        // Onay kodu al
        // Odemeyi tamamla
        // Google a geri don

        System.out.println("Teste basla");
        google();
        System.out.println("Testi bitir");
    }

    public static void google(){
        System.out.println("Google Websitesine gidildi");
        aramaYap();
    }

    public static void aramaYap(){
        System.out.println("Arama yapildi");
        System.out.println("Arama sonuclarindan urune tiklandi");
        urunSitesineGit();
    }

    public static void urunSitesineGit(){
        System.out.println("Urun sitesine gidildi");
        System.out.println("Urun secildi");
        sepeteEkle();
    }

    public static void sepeteEkle(){
        System.out.println("Urun sepete eklendi");
        odemeYap();
    }

    public static void odemeYap(){
        System.out.println("Hesap bilgileri girildi");
        onayKoduAl();
        System.out.println("Onay kodu girildi");
        System.out.println("Odeme tamamlandi");
        System.out.println("Googlea geri donuldu");
    }

    public static void onayKoduAl(){
        System.out.println("Onay kodu alindi");
    }
}
