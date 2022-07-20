public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        
        if (level >= 70) {
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }
    
    // Put getters here
    public String getName() {
        return name;
    }
    
    public int getLevel() {
        return level;
    }
    
    public boolean isFireBreather() {
        return canBreatheFire;
    }
    
    // Put other methods here
    public void attack() {
        if (canBreatheFire) {
            System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
        } else {
            System.out.println("~ ~ ~");
        }
    }
    
    public void gainExperience() {
        level += 10;
        if (level >= 70) {
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level;
    }
}