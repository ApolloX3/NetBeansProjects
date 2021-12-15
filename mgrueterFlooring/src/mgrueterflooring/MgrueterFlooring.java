/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Author: Michael Grueter
KSC Comp. Sci
date: Oct 2021
Purpose: estimate the cost of flooring and installation


 */
package mgrueterflooring;

public class MgrueterFlooring {

    // creates the main class
    public static void main(String[] args) {
        // instantiates and object title of Title class and prints to console
        Title title = new Title("FLOORING", "The flooring estimator");
        title.printTitle();

        // instantiates an object of Repeat class and prints to console,
        // calls method goAgain on pete
        // this allows user to repeat program
        Repeat pete = new Repeat();
        pete.goAgain();

        //instantiates a new object of the Menu class and calls method printMenu
        //this prpints menu to console
        Menu menu = new Menu();
        menu.printMenu();

    }

}
