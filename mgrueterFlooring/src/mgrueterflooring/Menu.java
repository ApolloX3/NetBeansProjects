/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgrueterflooring;

import java.util.Scanner;

public class Menu {

    /*
    1. Tile    4. carpet    
    2. Stone    5. linoleum
    3. hardwood 6. cork  
     */
    // create scannner
    Scanner scan = new Scanner(System.in);
    //declare neccesary variables intChoice to hold 
    //number relating to flooring type in menu
    // and dblPrice to hold value of type of flooring
    int intChoice = 0;
    public double dblPrice = 0;

    // creates printMenu() method which prints a list of flooring types opperated by a switch
    public void printMenu() {
        System.out.println("\n1.Tile       4.Carpet \n"
                + "2.Stone      5.Linoleum \n"
                + "3.Hardwood   6.Cork 6");
        System.out.println("\n Choose an item (1 -6) : ");
        // assignes intChoice to user input
        intChoice = scan.nextInt();
        // out puts chossen flooring type
        System.out.println("You chose " + intChoice);

        // Enter switch which allocates intChoices to a flooring type and cost per square foot depending
        // on the users choice
        switch (intChoice) {
            case 1:
                System.out.println("You chose Tile at $10.00 / square foot. ");
                dblPrice = 10.00;
                break;
            case 2:
                System.out.println("You choose Stone at $21.00 / square foot. ");
                dblPrice = 21.00;
                break;
            case 3:
                System.out.println("You chose Hardwood at $8.00 / square foot. ");
                dblPrice = 8.00;
                break;
            case 4:
                System.out.println("You chose Carpet at $ $5.00 / square yard. ");
                dblPrice = 5.00;
                break;
            case 5:
                System.out.println("You chose Linoleum at $ 3.45 / square foot. ");
                dblPrice = 3.45;
                break;
            case 6:
                System.out.println("You chose cork at $ 9.75 / square foot. ");
                dblPrice = 9.75;
                break;
            default: ///if anything other than the six choices, do this
                System.out.println("You made an invalid choice, choose again. ");

        }
        // asks user for amount of space if square feet they would like floored
        System.out.println("Enter the area in square feet that you would like floored: ");
        double area = scan.nextDouble();
        double cost = area * dblPrice;
        // outputs the cost of the flooring for a given area
        System.out.println("The cost of the flooring to cover your desired area is: " + cost + "$");
        double laborCost = cost * .3;
        double totalCost = laborCost + cost;
        //outputs the total cost with labor
        System.out.println("The total cost with labor is : " + totalCost);
    }

}
