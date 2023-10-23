package dersler17gun;

public class TrafficLiggths {
    public static void main(String[] args) {
        //Trafik isik renklerine göre Isigi tespit eden program yazin

        char color = 'r';
        String trafficLight;

        switch(color){
            case 'R' : case 'r' :
                trafficLight = "RED";
                break;
            case 'O' : case 'o' :
                trafficLight = "Orange";
                break;
            case 'G': case 'g':
                trafficLight = "Green";
                break;
            default:
                trafficLight = "Invalid Ligth";
        }

        System.out.println("trafficLight = " + trafficLight);
    }
}
