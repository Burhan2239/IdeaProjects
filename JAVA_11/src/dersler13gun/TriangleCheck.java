package dersler13gun;

public class TriangleCheck {
    public static void main(String[] args) {

        // Write a ternary that prints type of the triangle according to its angles
        // Ic acilari verilmis bir ucgenin hangi tur ucgen oldugunu tespit eden bir ternary yaziniz

        int aci1 = 60;
        int aci2 = 60;
        int aci3 = 60;

        String ucgenTuru;

        if(aci1 == aci2 && aci2 == aci3){
            ucgenTuru = "Eskenar Ucgen";
        }else if(aci1 == aci2 || aci1 == aci3 || aci2 == aci3){
            ucgenTuru = "Ikizkenar Ucgen";
        }else{
            ucgenTuru = "Cesitkenar Ucgen";
        }

        // System.out.println("ucgenTuru = " + ucgenTuru);

        ucgenTuru = (aci1 == aci2 && aci2 == aci3) ? "Eskenar Ucgen" : (aci1 == aci2 || aci1 == aci3 || aci2 == aci3) ? "Ikizkenar Ucgen" : "Cesitkenar Ucgen";

        System.out.println("ucgenTuru = " + ucgenTuru);
    }
}
