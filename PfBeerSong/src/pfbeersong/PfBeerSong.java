// This program orints verses of the famous "99 bottles of Beer" song
// based on the number of versus the user would like to hear
package pfbeersong;

public class PfBeerSong {

    public static void main(String[] args) {
        Title title = new Title("Beer Song", " 99 bottles of beer on the wall song...");
        title.printTitle();

        Repeat repeat = new Repeat();
        repeat.goAgain();

    }

}
