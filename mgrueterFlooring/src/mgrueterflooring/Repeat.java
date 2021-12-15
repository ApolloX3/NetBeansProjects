/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgrueterflooring;

import java.util.Scanner;

public class Repeat 
{
    // creates scanner and String strGoagain, strGoAagain is set to a value of "y"
    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";
    
    //declares method go again which allows the user to repeat the program 
    public void goAgain()
    {
    // while statment specifying that while strGoAgain is "y" the program will execute below
       while(strGoAgain.equalsIgnoreCase("y"))
    {
        // while strGoAgain is "Y", call the method printMenu on the menu class
        // this prints the menu to the console
        Menu menu = new Menu ();
        menu.printMenu();
        
        //prompt user to see if they would like to repeat the program yes or no
        System.out.print("Would you like to run it again? ( y or n) ");
        strGoAgain = scan.next();
       
    } //END OF WHILE() LOOP
    
    } // END OF METHOD goAgain()
    
} //END OF CLASS
