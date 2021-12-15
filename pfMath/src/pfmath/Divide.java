// This program takes input from the user and performs various simple arithmatic 
// operations on the numbers this program file divides 2 numbers
package pfmath;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Divide {

    Scanner scnr = new Scanner(System.in);
    double userNum1;
    double userNum2;
    double userAnswer;

    public void divide() {
        System.out.print("Enter first number to divide: ");
        userNum1 = scnr.nextDouble();

        System.out.print("Enter second number to divide it by: ");
        userNum2 = scnr.nextDouble();

        userAnswer = (userNum1 / userNum2);
        System.out.println(userAnswer);

    }

}
