public class CalculatorTester
{
    public static void main(String[] args) {

        System.out.println("Starting at 5");
        Calculator myTi = new Calculator(5);

        System.out.println("Adding 10 ...");
        System.out.print("Should print 15: ");
        System.out.println(myTi.add(10));

        System.out.println("Multiplying by 2 ...");
        System.out.print("Should print 30: ");
        System.out.println(myTi.multiple(2));

        System.out.println("Changing value to 20 ...");
        myTi.setValue(20);
        System.out.print("Adding. Should print 50: ");
        System.out.println(myTi.add());

    }
}