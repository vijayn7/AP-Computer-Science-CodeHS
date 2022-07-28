public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getWidth() {
        return width;
    }
    
    public String toString() {
        return "A rectangle with a width of " + width + " and a height of " + height;
    }
    
    public boolean equals(Rectangle other) {
        if (height == other.getHeight() && width == other.getWidth()) {
            return true;
        }
        return false;
    }
   
}