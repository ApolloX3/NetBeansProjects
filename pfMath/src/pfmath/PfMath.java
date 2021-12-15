// This program takes input from the user and performs various simple arithmatic 
// operations on the numbers this program file calls the various math methods
// from the PfMath class
package pfmath;

/**
 *
 * @author Michael
 */
public class PfMath 
{
    public static void main(String[] args) 
    {
        //**************************************
        // Instantiate an instance of the Multiply class
        Multiply times = new Multiply();
        times.multiply();
        //**************************************
        
        //**************************************
        // Instantiate an instance of the Add class
        Add plus = new Add();
        plus.add();
        //+++++++++++++++++++++++++++++++++++++++
        // Instantiate instance of square root class
        SquareRoot squareHead = new SquareRoot();
        squareHead.calculateSquareRoot();
        //+*****************************************
        // Instantiate instance of divide class
        Divide div = new Divide();
        div.divide();
        //++++++++++++++++++++++++++++++++++++++++++
        
        
    
    }
    
    
    
}
