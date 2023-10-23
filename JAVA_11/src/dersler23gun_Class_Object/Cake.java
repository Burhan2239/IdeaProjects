package dersler23gun_Class_Object;

public class Cake {
    String baker;
    int slice;
    boolean isChocolate;
    boolean isEgg;
    double weigth;
    static int cakeSlice = 10;

    public void eating(){
        slice--;
        System.out.println(baker + "'s cake slice is " + slice);
        cakeSlice--;
        System.out.println("CakeSlice is " + cakeSlice);
    }
}
