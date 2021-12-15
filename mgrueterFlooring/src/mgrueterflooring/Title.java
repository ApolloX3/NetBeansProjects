/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgrueterflooring;

/**
 *
 * @author Michael
 */
public class Title {
    
  private String strTitle, strTagline;
  
     public Title(String title, String tagline){
     this.strTitle = title;
     this.strTagline = tagline;
 
 }
    public void printTitle()
    {
    System.out.println("\t" + strTitle + "\n" + "\t" + strTagline);
    
 }
}
