/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfaveragesum;

/**
 *
 * @author Michael
 */
public class Title {

    private String strTitle, strTagline;

    //Constructor method that requires 2 strings to be added
    //to all instantiations
    public Title(String title, String tagline) {
        this.strTitle = title;
        this.strTagline = tagline;
    }

    //the method that does something
    public void printTitle() {
        System.out.println(strTitle + "\n" + "\t" + strTagline);
        //END of printTitle() METHOD
    }
}
