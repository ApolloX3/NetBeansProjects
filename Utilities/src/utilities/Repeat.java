// This is a program that calls repeats a program while the conditions of the  while loop are met
// in this case that strGoAgain is == the char or string "y"
// here the example is used with another program "Menu" which prints a menu and
// takes input regarding it
package utilities;

import java.util.Scanner;

public class Repeat {

    // scans for user input to ask if the program should be run again
    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";
    // creates method goAgain

    public void goAgain() {
        // while loop stating that while strAgain equals y the following will execute
        while (strGoAgain.equalsIgnoreCase("y")) {
            //executed program
            Menu menu = new Menu();
            menu.printMenu();

            // asks user if they would like to repeat and takes input as y or n
            System.out.print("Would you like to run it again? ( y or n) ");
            strGoAgain = scan.next();

        } //END OF WHILE() LOOP

    } // END OF METHOD goAgain()

} //END OF CLASS
