//This program creates a do the math class
// the toString method will take inputs for addition equation and assign the output
// to a third variable
//the divideInt method takes in two numbers and divides them
package pfthis;

public class DoTheMath {

    private int intNumber1, intNumber2, intNumber3;
    private double dblNumber1, dblNumber2, dblNumber3;

    public DoTheMath(int intNumber1, int intNumber2) {
        this.intNumber1 = intNumber1;
        this.intNumber2 = intNumber2;
    }
// Do the adition and assingment to variable intNumber3

    @Override
    public String toString() {
        intNumber3 = intNumber1 + intNumber2;
        return "DoTheMath{" + "intNumber1 = " + intNumber1 + ", intNumber2 = " + intNumber2 + ", intNumber3 = " + intNumber3 + '}';
    }

    // fivide two integers and print answer to console
    public void divideInt(int intNum1, int intNum2) {
        this.intNumber1 = intNum1;
        this.intNumber2 = intNum2;
        intNumber3 = intNumber2 / intNumber1;
        System.out.println(this.intNumber2 + " / " + intNumber1 + " this = " + intNumber3);
    }

}//END OF CLASS
