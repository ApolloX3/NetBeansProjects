
// This program demostrates the use of getters and setters, method, class, and object creation
// in tandem with the restaurant.java file outlining the restaurant class

package pfmethods;

public class PfMethods {

    public static void main(String[] args) {
        Restaurant favoriteDinner = new Restaurant("The Stage", 5);
        Restaurant favoriteLunch = new Restaurant("Five Guys", 4);
        Restaurant favoriteBreakfast = new Restaurant("McDonalds", 3);

        System.out.println("*********************************************************");
        System.out.println(favoriteDinner);
        System.out.println(favoriteLunch);
        System.out.println("*********************************************************");

        System.out.println(favoriteBreakfast);
        favoriteBreakfast.setStrRestaurantName("Lindy's");
        favoriteBreakfast.setIntRating(5);

        System.out.println("Using Getters");
        System.out.println("Favorite restaurant name: " + favoriteBreakfast.getStrRestaurantName());
        System.out.println("Rating: " + 5);

    }//END OF DRIVER METhOD

}//END OF CLASS
