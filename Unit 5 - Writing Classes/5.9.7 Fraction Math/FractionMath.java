public class FractionMath {
    
    /*
    * This is a static class that the Fraction class will use.
    * No updates are needed.
    */
    
    public static Fraction add(Fraction frac1, Fraction frac2){
        int numerator = frac1.getNumerator() * frac2.getDenominator() +
                        frac2.getNumerator() * frac1.getDenominator();

        int denominator = frac1.getDenominator() * frac2.getDenominator();

        Fraction solution = new Fraction(numerator, denominator);
        return solution;
    }

    public static Fraction multiply(Fraction frac1, Fraction frac2){
        int numerator = frac1.getNumerator() * frac2.getNumerator();
        int denominator = frac1.getDenominator() * frac2.getDenominator();
        Fraction solution = new Fraction(numerator, denominator);
        return solution;
    }
}