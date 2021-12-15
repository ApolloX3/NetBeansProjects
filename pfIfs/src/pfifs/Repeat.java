/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfifs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    public void goAgain() {

        while (strGoAgain.equalsIgnoreCase("y")) {
            //   Program gets age of customer and changes rates based on that age

            NumberFormat joe = NumberFormat.getCurrencyInstance();

            Scanner scan = new Scanner(System.in);
            int intNumber, intAge;
            double dblPrice = 155.00;
// prompts user for age
            System.out.println("Enter your Age: ");
            intAge = scan.nextInt();
// prints the normal rate
            System.out.println("Normal Rate: " + joe.format(dblPrice));
// specifiies that if age is within a certain range the rate will be minus 20 dollars
            if (intAge >= 65 && intAge < 75) {
                dblPrice = dblPrice - 20;
            } else {

            }

            System.out.println("Your rate: " + joe.format(dblPrice));
//prints out new rate (dblPrince)
            System.out.println("***********************************************\n");

            //*******************************************************************
            // This mini program looks are basid operands and how to create the absolute value of a number 
            // with an if statement
            System.out.println("Enter a Number: ");
            intNumber = scan.nextInt();
            // the comparison operators are ==, != , <, >, !<, !>, >=, <=
            if (intNumber < 0) {
                intNumber = -intNumber;
            }//END of IF
            System.out.println("Absolute Value of Number: " + intNumber);

            System.out.println("Would you like to run again (y or n)? ");
            strGoAgain = scan.next();
//        }// END of application here
        }
    }
}
