public class SolidTester
{
    public static void main(String[] args)
    {
        String name;
        double volume;
        double surfaceArea;

        // Pyramid constructor should take name, length, width, height
        // in that order
        Pyramid pyramid = new Pyramid("My pyramid", 1, 3, 5);
        name = pyramid.getName();
        volume = round(pyramid.volume(), 2);
        surfaceArea = round(pyramid.surfaceArea(), 2);
        System.out.println("Pyramid '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");

        // Sphere constructor should take name then radius
        Sphere sphere = new Sphere("My sphere", 4);
        name = sphere.getName();
        volume = round(sphere.volume(), 2);
        surfaceArea = round(sphere.surfaceArea(), 2);
        System.out.println("Sphere '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");
            
        // RectangularPrism constructor should take name, 
        // length, width, height in that order
        RectangularPrism rectangularPrism = new RectangularPrism("My rectangular prism",
            5, 8, 3);
        name = rectangularPrism.getName();
        volume = round(rectangularPrism.volume(), 2);
        surfaceArea = round(rectangularPrism.surfaceArea(), 2);
        System.out.println("RectangularPrism '" + name + "' has volume: " +
            volume + " and surface area: " + surfaceArea + ".");

        // Cylinder constructor should take name, radius, height
        // in that order
        Cylinder cylinder = new Cylinder("My cylinder", 4, 9);
        name = cylinder.getName();
        volume = round(cylinder.volume(), 2);
        surfaceArea = round(cylinder.surfaceArea(), 2);
        System.out.println("Cylinder '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");

        // Cube constructor should take name then side length
        Cube cube = new Cube("My cube", 4);
        name = cube.getName();
        volume = round(cube.volume(), 2);
        surfaceArea = round(cube.surfaceArea(), 2);
        System.out.println("Cube '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}