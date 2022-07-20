public class Fraction
{
    // Create your instance variables and constructor here
    private int numer;
    private int denom;
    
    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }
    
    public int getNumerator() {
        return numer;
    }
    
    public int getDenominator() {
        return denom;
    }
    
    public void setNumerator(int x) {
        numer = x;
    }
    
    
    public void setDenominator(int x) {
        denom = x;
    }
    
    public void add(Fraction other) {
        numer = numer*other.getDenominator() + other.getNumerator()*denom;
        denom = denom * other.getDenominator();
    }
    
    public void subtract(Fraction other) {
        numer = numer*other.getDenominator() - other.getNumerator()*denom;
        denom = denom * other.getDenominator();
    }
    
    public void multiply(Fraction other) {
        numer = numer*other.getNumerator();
        denom = denom*other.getDenominator();
    }
    
    public String toString() {
        return numer + " / " + denom;
    }
}