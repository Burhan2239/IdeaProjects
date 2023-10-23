public class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("Assignment operators in Java.");
        int num1;
        int num2;
        // int num1,num2;

        //"=" assignment operator
        num1 = 10;
        num2 = 5;

        System.out.println("\"=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + "\n");
        //System.out.println();

        //"+=" assignment operator
        System.out.println("\"+=\" assignment operator.");
        num1 += num2; // num1 = num1 + num2 ---> num1 = 10 + 5
        System.out.println("\"num1 += num2\" = " + num1);
        num1 = num1 + num2;
        System.out.println("num1 = " + num1);
        System.out.println();

        //"-=" assignment operator
        System.out.println("\"-=\" assignment operator.");
        num1 -= num2; //num1 = num1-num2; --->  num1 = 20 - 5
        System.out.println("num1 = " + num1);
        System.out.println();

        //"*=" assignment operator
        System.out.println("\"*=\" assignment operator.");
        num1 *= num2; //num1 = num1*num2; --->  num1 = 15 * 5
        System.out.println("num1 = " + num1);
        System.out.println();

        // "/=" assignment operator
        System.out.println("\"/=\" assignment operator.");
        System.out.println("num1 = " + num1) ;
        System.out.println("num2 = " + num2) ;
        num1 /= num2; //num1 = num1/num2; --->  num1 = 75 / 5
        System.out.println("num1 = " + num1);
        System.out.println();

        // "%=" assignment operator
        System.out.println("\"%=\" assignment operator.");
        System.out.println("num1 = " + num1) ;
        System.out.println("num2 = " + num2) ;
        num1 %= num2;
        System.out.println("num1 = " + num1);
        System.out.println();
    }
}
