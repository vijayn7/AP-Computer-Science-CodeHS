public class FoodTester
{
    public static void main(String[] args)
    {
        Food rice = new Food("Rice", 100);
        Fruit apple = new Fruit("Apple", 100, true, "Red");
        System.out.println(rice.toString());
        System.out.println(apple.toString());
    }
}