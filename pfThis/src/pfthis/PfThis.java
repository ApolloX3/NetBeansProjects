// instantiates the doIt object and calls the DoTheMath methods on it.
package pfthis;

public class PfThis {

    public static void main(String[] args) {
        DoTheMath doIt = new DoTheMath(5, 7);
        System.out.println(doIt);

        doIt.divideInt(3, 12);
    }

}// END OF DRIVER
