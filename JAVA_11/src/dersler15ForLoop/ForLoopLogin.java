package dersler15ForLoop;

import java.util.Scanner;

public class ForLoopLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "";
        String password = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter your user name : ");
            user = input.next();
            System.out.println();
            if (user.equals("Ahmet") && password.equals("12345")) {
                System.out.println("Login successful.");
                break;
            }else{
                System.out.println("User name or passsword is not correct!!");
                System.out.println("Try again.");
                System.out.println("You have " + (3-i) + "try left.");
            }
        }
    }
}
