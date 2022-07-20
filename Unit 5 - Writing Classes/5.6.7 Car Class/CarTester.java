public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car car = new Car(20.0, 15.0);
        
        //Fill up the gas tank
        car.addGas();
        
        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());

        //Drive 100 miles
        car.drive(100);

        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());

        //Add 2 gallons to the gas tank
        car.addGas(2.0);

        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());
        
        //Try driving more miles than available by driving 1000 miles
        car.drive(1000);
        
        //Drive 200 miles
        car.drive(200);

        //Check how much gas you have left
        System.out.println("Gas remaining: " + car.getGas());

        //Print total miles driven
        System.out.println("Total Miles Driven: " + car.getTotalMilesDriven());
        
    }
}