public class Car {

    //This code is complete
    private String model;
    private String mpg;

    public Car(String model, String mpg){
        this.model = model;
        this.mpg = mpg;
    }

    public String getModel(){
        return model;
    }

    public String getMPG(){
        return mpg;
    }

    public String toString(){
        return model + " gets " + mpg + " mpg.";
    }
}