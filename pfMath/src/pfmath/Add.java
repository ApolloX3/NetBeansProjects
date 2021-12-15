/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfmath;

import java.util.Scanner;

// This program takes input from the user and performs various simple arithmatic 
// operations on the numbers this program file adds two numbers

public class Add 
{
    Scanner scnr = new Scanner(System.in);
    float fltNumber1;
    float fltNumber2;
    float fltAnswer;

    public void add() 
    {

        System.out.print("Enter the first number to add: ");
        fltNumber1 = scnr.nextFloat();
        System.out.print("Enter the Second number to add: ");
        fltNumber2 = scnr.nextFloat();
        
        
        fltAnswer = fltNumber1 + fltNumber2;
        
        System.out.println(fltNumber1 + " plus " + fltNumber2 + " = " + fltAnswer);
    }
}


