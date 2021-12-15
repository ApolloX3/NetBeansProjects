package monyonXMASStreeMGRUETER;

public class PfChristmassLoop {

    public static void main(String[] args) {

        // assigns title to program and prints to console
        Title tim = new Title("Christmass Tree", "Merry Christmass");
        tim.printTitle();
        System.out.println("");

        //allows program to be repeated by  calling goAgain method on repeat class
        Repeat pete = new Repeat();
        pete.goAgain();

    }

}
