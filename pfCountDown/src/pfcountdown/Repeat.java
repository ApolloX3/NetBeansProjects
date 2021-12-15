/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfcountdown;

import java.text.NumberFormat;
import java.util.Scanner;

public class Repeat {

    Scanner scan = new Scanner(System.in);
    String strGoAgain = "y";
// for delay on countdown
    public void goAgain() throws InterruptedException {

        while (strGoAgain.equalsIgnoreCase("y")) {
            int intCount;

            System.out.println("***********************************************\n");
// asks user for count down value
            System.out.print("How many times would you like to count? ");
            intCount = scan.nextInt();

            // The classic for() loop. Remember to code each of the three 
            // parts of the conidition; the initialization, the comparison and the increment
            // for the inout value, count down from that value to zero and prints blast off
            for (intCount = scan.nextInt(); intCount >= 0; intCount = intCount - 1) {
                Thread.sleep(1000);
                System.out.println(intCount + ", ");

            }
            System.out.println("\n--------Blast off!-----------");

            System.out.println("***********************************************\n");

            //*******************************************************************
            System.out.println("Would you like to run again (y or n)? ");
            strGoAgain = scan.next();
//        }// END of application here
        }
    }
}
