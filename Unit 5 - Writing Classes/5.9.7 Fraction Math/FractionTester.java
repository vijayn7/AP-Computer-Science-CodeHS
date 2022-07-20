public class FractionTester
{
    public static void main(String[] args) {
        Fraction first = new Fraction(3, 4);

        Fraction half = new Fraction(1, 2);

        System.out.println(first);
        System.out.print("Multiplying: ");
        System.out.println(half);

        first.multiplyFraction(half);

        System.out.println("Answer: " + first);

        System.out.println();
        System.out.print("Adding: ");
        System.out.println(half);

        first.addFraction(half);

        System.out.println("Answer: " + first);
    }

}