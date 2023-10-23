package dersler19gun;

public class DisplayMessage {
    public static void main(String[] args) {

        // Decalre edilen method ayni islemin tekrarinda defaetle kullanilabilir - reusable
        System.out.println("Babam geldi!");
        displayMessage();
        System.out.println("Annem geldi!");
        displayMessage();
        System.out.println("Amcam geldi!");
        displayMessage();
        System.out.println("Dayim geldi!");
        displayMessage();

    }

    public static void displayMessage(){
        System.out.println("Hi");
    }
}
