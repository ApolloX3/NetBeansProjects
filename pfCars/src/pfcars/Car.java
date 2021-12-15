package pfcars;
//Make
//Model
//year
// list the whole collection, trade in car, sell car, edit car
//C. create R. read U. update D. Delete

public class Car {

    private String strMake, strModel;
    private int intYear;

//contructor
    public Car(String make, String model, int year) {
        this.strMake = make;
        this.strModel = model;
        this.intYear = year;
    }

    public String getStrMake() {
        return strMake;
    }

    public void setStrMake(String strMake) {
        this.strMake = strMake;
    }

    public String getStrModel() {
        return strModel;
    }

    public void setStrModel(String strModel) {
        this.strModel = strModel;
    }

    public int getIntYear() {
        return intYear;
    }

    public void setIntYear(int intYear) {
        this.intYear = intYear;
    }

    
    

}
