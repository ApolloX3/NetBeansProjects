package pfcountdown;

public class PfCountDown {

    // this program is a set-able countdown untill blast off timer that takes
    // a user input countsdown value
    
    public static void main(String[] args) {
        Title tim = new Title("Count Down", "Count down until blast off! ");
        tim.printTitle();
        System.out.println("");

        Repeat pete = new Repeat();
        pete.goAgain();

    }

}
