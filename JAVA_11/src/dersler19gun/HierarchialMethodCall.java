package dersler19gun;

public class HierarchialMethodCall {
    public static void main(String[] args) {

        System.out.println("Main Method - line 7");
        displayMessage();
        System.out.println("Main Method - line 9");
    }

    public static void displayMessage(){

        System.out.println("Display Method - line 14");
        calculation();
        System.out.println("Display Method - line 16");
    }

    public static void calculation(){
        System.out.println("Calculation Method - line 20");
    }
}
