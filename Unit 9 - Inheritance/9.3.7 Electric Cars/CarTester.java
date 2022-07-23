public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car car = new Car("model", "mpg");
        // Print out the model
        System.out.println(car.getModel());
        // Print out the MPG
        System.out.println(car.getMPG());
        // Print the object
        System.out.println(car.toString());
        // Create an ElectricCar object
        ElectricCar eCar = new ElectricCar("name");
        // Print out the model
        System.out.println(eCar.getModel());
        // Print out the MPG
        System.out.println(eCar.getMPG());
        // Print the object
        System.out.println(eCar.toString());
    }
}