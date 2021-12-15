package pfif;

import java.util.Scanner;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    public void goAgain() {

        while (strGoAgain.equalsIgnoreCase("y")) {
            // 1. before 67, few features
            // 2. after 70, seatbelts
            // 3. after 92, stability control       
//prompts user to enter a vehicle year 
            System.out.println("Enter the year of your vehicle: ");
            int carYear = scan.nextInt();
// if the car year is within certain year range print the year and a message
            if (carYear <= 1967) {
                System.out.println("Your " + carYear + " Vehicle has few features");
            } else if (carYear <= 1970) {
                System.out.println("Your " + carYear + " Vehicle has seatbelts");
            } else if (carYear <= 1992) {
                System.out.println("Your " + carYear + " Vehicle has few features");
            } else if (carYear <= 1967) {
                System.out.println("Your " + carYear + " Vehicle has electronic stability control ");
            } else if (carYear <= 2001) {
                System.out.println("Your " + carYear + " Vehicle has some features");
            }

            System.out.println("Would you like to run again? (y or n) ");

            strGoAgain = scan.next();
        }// end of while() loop
    } // end of method, goAgain();
} // end of class

