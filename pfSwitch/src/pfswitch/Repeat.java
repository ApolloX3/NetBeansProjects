package pfswitch;

// This program demonstrates the use of the switch
//it takes user input relating to a car and provides outputs 
//through the switch based on that user information
import java.text.NumberFormat;
import java.util.Scanner;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";

    public void goAgain() {

        while (strGoAgain.equalsIgnoreCase("y")) {

            //retrieving user input
            int intCars, intYear;
            String strCar, strMake, strModel;
            System.out.println("Enter year of car: ");
            intYear = scan.nextInt();
            System.out.println(" Enter make of car: ");
            strMake = scan.next();
            System.out.println("Enter model of car: ");
            strModel = scan.next();
// defines switch as taking a variable "intYear" which will come from the user
            switch (intYear) {
                // creates cases for the computer the look for based on inYear
                case 1901:
                case 1902:
                case 1903:
                case 1904:
                case 1905:
// when switch reaches this case execute the following logic...
                case 1915:
                    if (intYear > 1900 && intYear < 1931) {
                        System.out.println("Yout car : \n");
                        System.out.println(intYear + " " + strMake + " " + strModel);
                        System.out.println(" Your car is a senior antique. ");
                    }
                    // after case logic is finished break out of the switch
                    break;
// when switch reaches this case execute the following logic...

                case 1957:
                    if (intYear > 1957 && intYear < 1962) {
                        System.out.println("Yout car : \n");
                        System.out.println(intYear + " " + strMake + " " + strModel);
                    }
                    break;

                default:
                    //default out put if no cases are met
                    System.out.println("Whats the matter no cars in your collection? ");

            }
// asks user if they would like to run the program again
            System.out.println("Would you like to run again (y or n)? ");
            strGoAgain = scan.next();

        }
    }
}
