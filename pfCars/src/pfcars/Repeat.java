package pfcars;

import java.util.Scanner;
import java.util.Arrays;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    
    
    public static Car[] cars = {new Car("Cadillac",
        "Fleetwood",
        1966),
        new Car("Cadillac",
        "Coupe DeVille",
        1959),
        new Car("Triumph",
        "TR6",
        1968),
        new Car("Pontiac",
        "GTO",
        1967),
        new Car("Oldsmobile",
        "Starfire",
        1962),
        new Car("Volkswagen",
        "Beetle",
        1958),
        new Car("Mercedes-Benz",
        "500 SEL",
        1981),
        new Car("Saab",
        "900 Turbo",
        1984),
        new Car("Mercedes-Benz",
        "SL500, R129",
        1999),
        new Car("Tesla",
        "Y",
        2020),
        new Car("Nissan",
        "Titan",
        2006),
        new Car("Dodge",
        "Stratos",
        2002)};

   
        public void goAgain() {

        // while loop stating that while strAgain equals y the following will execute
        
        while (strGoAgain.equalsIgnoreCase("y")) {
            
            //prints menu of cars
            

            Menu menu = new Menu();
            menu.printMenu();
           
            // Prints list of car inventory
           
            for (int i = 0; i < cars.length; i++) {

            System.out.println("Name: " + cars[i].getStrMake());
            System.out.println("Year: " + cars[i].getStrModel());
            System.out.println("GPA: " + cars[i].getIntYear());
               
                }
              
            // asks user if they would like to repeat and takes input as y or n
            System.out.print("Would you like to run it again? ( y or n) ");
            strGoAgain = scan.next();

        } 

    } 
}

