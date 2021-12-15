// This program takes input from the user and performs various simple arithmatic 
// operations on the numbers this program file mulitiplies two numbers
package pfmath;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Multiply {//Braces are "block operators"
    // every statement with block operators must NOT have ; 

//This is our first method!
    public void multiply() {

        //Operands
        float fltNumber1;
        float fltNumber2;
        //answer
        float fltAnswer;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the first number to multiply: ");
        fltNumber1 = scnr.nextFloat();
        System.out.print("Enter the second number to multiply: ");
        fltNumber2 = scnr.nextFloat();

        fltAnswer = fltNumber1 * fltNumber2;
        System.out.println("Your answer: " + fltAnswer + ".");

    }

}
