/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfdatatypes;

public class PfdataTypes {

    //this program is a general overview of the use of the primitive data types in java
    public static void main(String[] args) {
        // Declare data types / variables
        //Numeric variable
        //Scalar data // aka primitive data
        // Integer = Wrapper class also have for double etc...
        int intNumber1, intNumber2, intAnswer;
        float fltNumber1, fltNumber2, fltAnswer;
        double dblNumber1, dblNumber2, dblAnswer;
        Integer intNumber5 = 5;
        intNumber2 = 2;
// prints byte value in memory of variable
        System.out.println("Byte value of intNumber5: " + intNumber5.byteValue());
// initialization of char and boolean types
        char chrFirstIntial, chrMiddleInitial, chrLastInitial;
        boolean blIsReady;

        char charFirstInitial = 'M';
        char charMiddleInitial = 'Q';
        char charLastInitial = 'M';
// prints initials from char variables
        System.out.println("Your intials are: " + charFirstInitial + ". " + charMiddleInitial + ". " + charLastInitial + ". ");

        // null hs null value operator
        // object variable made out of a class
        String strFullName = "Mickey M. Mouse";
        System.out.println(strFullName);
// using .length to find length of string
//using .charAt to retrieve a char at index 5
//ising .concat to add "jr" to end of a name
        System.out.println("The lenghth of the string is : " + strFullName.length());
        System.out.println("Using the charAt method: " + strFullName.charAt(5));
        System.out.println("Using the concat method: " + strFullName.concat(" Jr"));
// basic incrementer operand usage
        System.out.println("****************************************************");
        System.out.println("");
        System.out.println("The Sum of 3 + 3 =  " + (3 + 3));
// using .compareTo() to compare validity by unicode of data >0 <0 for bigger of smaller 0 fir exactly the same
        System.out.println(" The value of intNumber2: " + (intNumber2));
        System.out.println("The value of intNumber5: " + (intNumber5.compareTo(intNumber2)));

    }// End of Driver Method main()

}// End of Class.
