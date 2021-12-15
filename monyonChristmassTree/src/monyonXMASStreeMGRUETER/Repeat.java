/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monyonXMASStreeMGRUETER;

import static java.lang.Thread.sleep;
import java.text.NumberFormat;
import java.util.Scanner;

// This program prints a christmass tree of *'s based on the number
// of rows input by a user. If the user does not want to run the program
//"goodbye" is printed.
// instantiates repeat class allowing user to run program in driver
public class Repeat {
// instatiates method Scanner of scan class

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

//instantiates goAgain method to allow user to repeat the program when prompted 
    public void goAgain() {
        while (strGoAgain.equalsIgnoreCase("y")) {
            // prompt user to enter number of desired rows
            System.out.println("Enter number of rows: ");
            // instantiates variable numRows with user input
            int numRows;
            numRows = scan.nextInt();

            // for hieght of tree/number of rows do the following in each row...
            for (int i = 0; i < numRows; i++) {
                //prints number of spaces to get stars in correct location
                //numrows - the incrementer variable i leaves a decreasing number of spaces with each iteration
                for (int space = 0; space < numRows - i; space++) {
                    System.out.print(" ");
                }
                // for height of tree (i) print number of stars i*2 - 1 for odd # of stars
                // this occurs directly after spaces are printed in sequence
                for (int star = 0; star < (i * 2) - 1; star++) {
                    System.out.print("*");
                }
                // seperate truck from tree with one space
                System.out.println("");
            }
            //  prints a trunck for the tree to console
            System.out.println("        ******");
            System.out.println("        ******");
            //prompts user to repeat program
            System.out.println("\nWould you like to run again (y or n)? ");

            // strGoAgain = scan.next();
            // prints "Goodbye if user doesn't want to repeat program
            strGoAgain = scan.next();

        }
        //Prints "Goodbye" if user does not want to run program
        System.out.println("Goodbye");

    }
}
