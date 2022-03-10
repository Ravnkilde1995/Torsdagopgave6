public class Car {
    //fields
    private String make;
    private int year;
    private String model;
    private String bodyStyle;
    private Driver driver;

    //Constructor
   /* public Car (String make, String model, String bodyStyle, Driver driver, int year){
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.driver = driver;
        this.year = year;
    }*/

    public Car(String make, int year, String model, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.year = year;
    }

    //methods
    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make=make;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getBodyStyle(){
        return bodyStyle;
    }
    public void setBodyStyle(String bodyStyle){
        this.bodyStyle=bodyStyle;
    }
    public Driver getDriver(){
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return " Make: " + make + "\n Model: " +  model + "\n Year: " + year + "\n Bodystyle: "+ bodyStyle;
    }
}

