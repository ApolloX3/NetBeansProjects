/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pflargestnumber;

import java.util.Scanner;

public class PfLargestNumber {
// This program prints the largest number in an array

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//initialize variable maxNum to hold largest value

        int maxNum = 0;
        int[] intNumbers = {1, 34, 4, 36, 200};

        // for loop iterates through the array and checks if each number is 
        //larger thans the value of maxNum and updates it if its smaller than previous
        for (int i = 0; i < intNumbers.length; i++) {
            if (maxNum < intNumbers[i]) {
                maxNum = intNumbers[i];
            }

        }
        System.out.println("Largerst number is: " + maxNum);
    }
}
