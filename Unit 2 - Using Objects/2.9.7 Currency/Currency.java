import java.security.cert.PolicyNode;

public class Currency
{
    private String value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = Double.toString(startValue);
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = Double.toString(newValue);
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        int pointIndex = value.indexOf(".");
        String dollars = value.substring(0, pointIndex);
        return Integer.valueOf(dollars);
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public int getCents()
    {
        int pointIndex = value.indexOf(".");
        Double c = Double.valueOf(value);
        c -= Double.valueOf(value.substring(0, pointIndex));
        c *= 100;
        return (int)Math.round(c);
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}