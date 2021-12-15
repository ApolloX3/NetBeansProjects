// This program takes input from the user and performs various simple arithmatic 
// operations on the numbers this program subtracts two numbers
package pfmath;

import java.util.Scanner;

public class Subtract {

    Scanner scnr = new Scanner(System.in);
    double userNum1;
    double userNum2;
    double userAnswer;

    public void subtract() {
        System.out.print("Enter first number to subtract: ");
        userNum1 = scnr.nextDouble();
        System.out.println("Enter second number to subtract the first by: ");
        userNum2 = scnr.nextDouble();
        userAnswer = (userNum1 - userNum2);
        System.out.println(userAnswer);

    }
}
