public class Fruit extends HealthyFood
{
    private boolean isLocal;
    private String foodColor;
    
    public Fruit(String foodName, int calories, boolean isLocal, String foodColor) {
        super(foodName, calories, "Fruit");
        this.isLocal = isLocal;
        this.foodColor = foodColor;
    }
    
    public boolean isLocal() {
        return isLocal;
    }
    
    public String getColor() {
        return foodColor;
    }
}