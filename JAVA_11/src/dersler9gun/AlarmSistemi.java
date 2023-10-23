package dersler9gun;

public class AlarmSistemi {
    public static void main(String[] args) {
        System.out.println("Alarm system with logical operators.");
        //Sensors
        boolean anaKapi = false;
        boolean pencere1 = false;
        boolean pencere2 = false;
        boolean pencere3 = false;
        boolean balkonKapisi = false;

        boolean alarmTetiklendiMi = false;

        System.out.println("Alarm sitemi durumu");
        System.out.println("-------------------");
        System.out.println("Anakapı Sensörü   : " + anaKapi);
        System.out.println("Pencere-1 Sensörü : " + pencere1);
        System.out.println("Pencere-2 Sensörü : " + pencere2);
        System.out.println("Pencere-3 Sensörü : " + pencere3);
        System.out.println("Balkon(K) Sensörü : " + balkonKapisi);
        System.out.println();

        pencere1 = true;

        alarmTetiklendiMi = (anaKapi || pencere1 || pencere2 || pencere3 || balkonKapisi);

        System.out.println("Alarm sitemi durumu");
        System.out.println("-------------------");
        System.out.println("Anakapı Sensörü   : " + anaKapi);
        System.out.println("Pencere-1 Sensörü : " + pencere1);
        System.out.println("Pencere-2 Sensörü : " + pencere2);
        System.out.println("Pencere-3 Sensörü : " + pencere3);
        System.out.println("Balkon(K) Sensörü : " + balkonKapisi);
        System.out.println();
        System.out.println("Alarm status : " + alarmTetiklendiMi);

        anaKapi = false;
        pencere1 = false;

        pencere3 = true;
        balkonKapisi = false;

        alarmTetiklendiMi = (anaKapi || pencere1 || pencere2 || (pencere3 && balkonKapisi));

        System.out.println("Alarm sitemi durumu");
        System.out.println("-------------------");
        System.out.println("Anakapı Sensörü   : " + anaKapi);
        System.out.println("Pencere-1 Sensörü : " + pencere1);
        System.out.println("Pencere-2 Sensörü : " + pencere2);
        System.out.println("Pencere-3 Sensörü : " + pencere3);
        System.out.println("Balkon(K) Sensörü : " + balkonKapisi);
        System.out.println();
        System.out.println("Alarm status : " + alarmTetiklendiMi);
    }

}
