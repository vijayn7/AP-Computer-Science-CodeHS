public class Food
{
    private String name;
    private int cal;
    
    public Food (String foodName, int calories) {
        name = foodName;
        cal = calories;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCal() {
        return cal;
    }
    
    public String toString() {
        return name + " has " + cal + " calories";
    }
}