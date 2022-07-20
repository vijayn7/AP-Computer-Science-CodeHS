public class Food
{
        //Declare instance variables
        String name;
        int calories;
        
        
        //Create Food Constructor
        public Food(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }
        
        //Add getter and setter methods for calories
        public void setCalories(int x) {
            calories = x;
        }
        
        public int getCalories() {
            return calories;
        }
        
        
        //Add getter and setter methods for name
        public void setName(String x) {
            name = x;
        }
        
        public String getName() {
            return name;
        }
        
        //Add toString method
        public String toString() {
            return name + " have " + calories + " calories.";
        }
}