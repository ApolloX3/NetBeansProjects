/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfarrays;

import java.util.Scanner;

// declares an arrays class
public class PfArrays {
// declares main 

    public static void main(String[] args) {
        //instantiates Scanner scan and integer variable intMonth
        Scanner scan = new Scanner(System.in);
        int intMonth = 0;
//prompts user for a month (by number)
        System.out.println("Enter month's number (1 - 12): ");
        intMonth = scan.nextInt();
//instantieates new array with and index length of 12 
        int intMonths[] = new int[12];
        // fills array with values 1 - 12
        intMonths[0] = 1;
        intMonths[1] = 2;
        intMonths[2] = 3;
        intMonths[3] = 4;
        intMonths[4] = 5;
        intMonths[5] = 6;
        intMonths[6] = 7;
        intMonths[7] = 8;
        intMonths[8] = 9;
        intMonths[9] = 10;
        intMonths[10] = 11;
        intMonths[11] = 12;
// declares new array of strings strMonths and instantiates it with months of year
        String strMonths[] = {"January", "February", "March", "April", "May", "June", "July", "August", "October", "November", "December"};
// prints the month number chosen by the user and the readout of the month coorisponding to that month number
        System.out.println("You entered number " + intMonth + " which is " + strMonths[intMonth - 1]);
// prints the month coorisponding to each number in the array intMonths
        for (int i = 0; i < intMonths.length; i++) {
            System.out.println("Month " + intMonths[i] + " is " + strMonths[i]);
        }

    }
}
