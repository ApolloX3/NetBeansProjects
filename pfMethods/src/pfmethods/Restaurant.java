package pfmethods;

// This program demostrates the use of getters and setters, method, class, and object creation
// in tandem with the Pf.Methods file outlining the restaurant class
public class Restaurant {
    // Scope determines where something can be seen or used ex. public/ private
    // Create encapsulation by using private properties.

    private String strRestaurantName;
    private int intRating;

    public Restaurant(String restaurantName, int rating) {
        this.strRestaurantName = restaurantName;
        this.intRating = rating;
    }

    public String getStrRestaurantName() {
        return strRestaurantName;
    }

    public void setStrRestaurantName(String strRestaurantName) {
        this.strRestaurantName = strRestaurantName;
    }

    public int getIntRating() {
        return intRating;
    }

    public void setIntRating(int intRating) {
        this.intRating = intRating;
    }

    // toString allows printing its constents by simply using its referance 
    //variable, or its object name.
    @Override
    public String toString() {
        return "Favorite restaurant Name: " + strRestaurantName + ", Rating: " + intRating + "\n";
    }

}//END OF CLASS
