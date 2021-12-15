// This program takes input from the user and performs various simple arithmatic 
// operations on the numbers this program file  square roots a number from user
package pfmath;

import java.util.Scanner;
//import java.math;

public class SquareRoot {

    Scanner scnr = new Scanner(System.in);
    double dblNumber, dblAnswer;

    public void calculateSquareRoot() {
        System.out.print("Enter a number: ");
        dblNumber = scnr.nextDouble();

        dblAnswer = Math.sqrt(dblNumber);

        System.out.println("The square root of " + dblNumber + " = " + dblAnswer);

    }

}
