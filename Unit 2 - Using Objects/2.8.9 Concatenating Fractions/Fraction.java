public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    // Returns the numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    // Returns the denominator
    public int getDenominator()
    {
        return denominator;
    }
    
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    
}