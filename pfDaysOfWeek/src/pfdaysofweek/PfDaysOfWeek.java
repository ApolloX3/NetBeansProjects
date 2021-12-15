/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfdaysofweek;

import java.util.Scanner;

public class PfDaysOfWeek {
//This program creats an array of days of the week
// it then asks the user what day of the week they want to print to console
// prints day of week selected and list of days of week

    public static void main(String[] args) {
        //creates array
        String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scan = new Scanner(System.in);
        //gets user input
        System.out.println("Enter a number 1 - 7: ");
        int intDay = scan.nextInt();
        //print days of week
        for (int i = 0; i < strDays.length; i++) {
            System.out.println(strDays[i]);
        }
        //prints the dsay of the week selected
        System.out.println("\n\n" + strDays[intDay - 1]);
    }

}
