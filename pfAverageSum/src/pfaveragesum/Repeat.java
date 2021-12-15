/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfaveragesum;

import java.text.NumberFormat;
import java.util.Scanner;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    public void goAgain() {
        while (strGoAgain.equalsIgnoreCase("y")) {
            //In Repeat class, write an array that accepts 10 double numbers
// instantiates new array dblNumbers with 10 indeces + declares variables
            double[] dblNumbers = new double[10];
            int countNum = 0;
            double sumNum = 0;
            double avgNum = 0;
// prompts user to enter numbers to fill array
            System.out.println("Enter  10 numbers into your array (decimals okay): ");
// for each value entered by user place it in array dblnumbers
            for (int i = 0; i < dblNumbers.length; i++) {
                dblNumbers[i] = scan.nextDouble();
            }

            //print array values in array dblNumbers to console with location in array ( countNum) of that value
            System.out.println(" Your array values are");
            for (int i = 0; i < dblNumbers.length; i++) {

                countNum += 1;
                System.out.println("Array value " + countNum + " is : " + dblNumbers[i]);
            }

// Sums array dblNumbers         
            for (int i = 0; i < dblNumbers.length; i++) {
                sumNum = sumNum + dblNumbers[i];
            }
// Prints sum to console
            System.out.println("Your sum is : " + sumNum);

// Avergres numbers in console
            avgNum = sumNum / dblNumbers.length;

// Prints average to console
            System.out.println("Your Average is : " + avgNum);

            System.out.println("\nWould you like to run again (y or n)? ");
            strGoAgain = scan.next();
        }
    }
}
