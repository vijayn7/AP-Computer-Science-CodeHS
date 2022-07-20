public class Car {

    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity) {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
        gas = 0.0;
        totalMilesDriven = 0.0;
    }
    
    public void addGas() {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    
    public void addGas(double x) {
        System.out.println("Adding gas ...");
        if ((gas + x) > tankCapacity) {
            gas = tankCapacity;
        } else {
            gas += x;
        }
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        if (canDrive(distance)) {
            totalMilesDriven += distance;
            gas -= distance / efficiency;
            System.out.println("Driving " + distance);
        } else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive(double distance) {
        if (milesAvailable() >= distance) {
            return true;
        }
        return false;
    }
    
    public double milesAvailable() {
        return gas * efficiency;
    }
    
    
    public double getGas() {
        return gas;
    }
}