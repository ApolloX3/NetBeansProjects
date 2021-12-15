// This program creates a customized title the will print to the console
package utilities;

public class Title {
// initialize title and subtitle

    private String strTitle, strTagline;

    //Constructor method that requires 2 strings to be added
    //to all instantiations
    //ecapsulates title and subtitle (tagline) into that method
    //if user wants to get and set
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
