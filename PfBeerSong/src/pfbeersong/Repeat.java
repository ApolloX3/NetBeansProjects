/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfbeersong;

import java.text.NumberFormat;
import java.util.Scanner;

public class Repeat {
// declareation and instantiation of needed variables
//including scanner

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";
    int userInput;
    int verseNum = 1;

    public void goAgain() {

        while (strGoAgain.equalsIgnoreCase("y")) {
// asks user how many versus of the beet song that they would like to hear
            System.out.println("How many verses of the Beer Song would you like to hear?");
//for the number of verses that the user would like to hear, print the versus
// up to but not including the last verse
            for (userInput = scan.nextInt(); userInput >= 2; userInput--) {

                System.out.println("Verse: " + (verseNum));
                System.out.println(userInput + " Bottles of beer on the wall.\n"
                        + userInput + " bottles of beer,\n"
                        + "Take one down, pass it around...");
                System.out.println((userInput - 1) + " bottles of beer on the wall.\n");

                ++verseNum;

            }
// when the number of verses left to print is 1 print the special case below for the final verse
            if (userInput == 1) {

                System.out.println("Verse: " + verseNum);
                System.out.println(userInput + " Bottle of beer on the wall,\n"
                        + userInput + " bottle of beer,\n"
                        + "Take one down, pass it around... ");

                System.out.println((userInput - 1) + " bottles of beer on the wall.");

            }
// after the requested number of verses are printed inform the user that there are no more beers on the wall to sing about
            System.out.println("...no more bottles of beer on the wall");

        }
// ask user it they would like to repeat the program
        System.out.println("Would you like to run again (y or n)? ");
        strGoAgain = scan.next();
// if they dont want hear the song anymore, say goodbye
        System.out.println("Goodbye");
    }
}
