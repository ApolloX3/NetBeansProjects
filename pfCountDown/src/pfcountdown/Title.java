package pfcountdown;

public class Title {

    private String strTitle, strTagline;

    //Constructor method that requires 2 strings to be added
    //to all instantiations
    public Title(String title, String tagline) {
        this.strTitle = title;
        this.strTagline = tagline;
    }

    //the method that prints the title to the console
    public void printTitle() {
        System.out.println(strTitle + "\n" + "\t" + strTagline);
        //END of printTitle() METHOD
    }
}
