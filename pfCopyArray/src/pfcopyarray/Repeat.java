/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfcopyarray;

import java.util.Scanner;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    public void goAgain() {

        while (strGoAgain.equalsIgnoreCase("y")) {

            int[] intNumbers = new int[10];
            int[] intCopiedNumbers = new int[10];
            int i, intCounter = 10;

            // fills an array with values 1 -10
            for (i = 0; i < 10; i++) {
                intNumbers[i] = i + 1;
                System.out.print(intNumbers[i]);
            }
            // set new arrays equal to old
            for (i = 0; i < 10; i++) {
                intCopiedNumbers[i] = intNumbers[i];
            }

            // fills array intNumbers with 10 , 9 , 8 ... 1and assigns it to int copied numbers
            for (i = 0; i < intNumbers.length; i++) {
                intCounter = intCounter - 1;
                intCopiedNumbers[i] = intNumbers[intCounter];
            }

            System.out.print("Would you like to run it again? ( y or n) ");
            strGoAgain = scan.next();

        } //END OF WHILE() LOOP

    } // END OF METHOD goAgain()

} //END OF CLASS
