//This program prints a menu to the console and asks the user to choose one
// it takes the user input and gives out the item chossen and tells the user 
// the item they chose
package utilities;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    int intChoice = 0;
// creates a method called printMenu which prints a menu to console

    public void printMenu() {
        System.out.println("1.Item1       4.Item 4\n"
                + "2.Item2       5.Item 5\n"
                + "3.Item3       6.Item 6");
        // takes the item chossen by the user from the console
        System.out.println("\n Choose an item (1 -6) : ");
        intChoice = scan.nextInt();
// outputs the item number the user chose
        System.out.println("You chose " + intChoice);
// a switch that provides the item selected by looking at
// intChoice and finding the case that matches it, 
        switch (intChoice) {
            case 1:
                System.out.println(" This is Item 1");
                break;
            case 2:
                System.out.println(" This is Item 2");
                break;
            case 3:
                System.out.println("This is Item 3");
                break;
            case 4:
                System.out.println(" This is Item 4");
                break;
            case 5:
                System.out.println("This is Item 5");
                break;
            case 6:
                System.out.println("This is Item 6");
                break;
            default:
                System.out.println(" That Item is not in the menu");
        }

    }

}


