import java.util.*;
public class CarTester
{
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter a car model name(exit to quit): ");
            String model = sc.nextLine();
            if(model.equals("exit")) {
                break;
            }
            System.out.println("Is this car electric? (y or n) ");
            String electric = sc.nextLine();
            if(electric.equals("y")) {
                ElectricCar electricCar = new ElectricCar(model);
                cars.add(electricCar);
            } else {
                System.out.println("How many miles per gallon: ");
                String mpg = sc.nextLine();
                Car car = new Car(model, mpg);
                cars.add(car);
            }
        }

        for(Car c : cars) {
            System.out.println("Car: " + c.getModel());
            System.out.println("MPG: " + c.getMPG());
            System.out.println();
        }
    }
}