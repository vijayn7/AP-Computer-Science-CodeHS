public class HealthyFood extends Food
{
    private String foodGroup;
    
    public HealthyFood(String foodName, int calories, String foodGroup) {
        super(foodName, calories);
        this.foodGroup = foodGroup;
    }
    
    public String getGroup() {
        return foodGroup;
    }
}