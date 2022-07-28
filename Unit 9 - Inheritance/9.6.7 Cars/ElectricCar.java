public class ElectricCar extends Car {

    // Complete the constructor
    public ElectricCar(String model){
        super(model, "Electric cars do not calculate MPG.");
    }

    // Override the getMPG here.
    // It should return: "Electric cars do not calculate MPG."
    @Override
    public String getMPG() {
        return "Electric cars do not calculate MPG";
    }

    // Override the toString() here.
    // (model) is an  electric car.
    @Override
    public String toString() {
        return super.getModel() + " is an electric car.";
    }
    
}