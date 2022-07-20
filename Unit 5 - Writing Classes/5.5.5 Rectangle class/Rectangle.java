public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    

    // Put your methods here
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getArea() {
        return width * height;
    }
    
    public int getPerimeter() {
        return 2*width + 2*height;
    }
    
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    
    public void setHeight(int newHeight) {
        height = newHeight;
    }


    /**
     * This method computes and prints the
     * area of the Rectangle.
     * Note it will print the area of the
     * Rectangle object that called it using
     * the dot operator!
     */ 
    public void printArea()
    {
        int area = width * height;
        System.out.println(area);
    }
    
    /**
     * This method computes and prints the
     * perimeter of the Rectangle.
     */ 
    public void printPerimeter()
    {
        int perimeter = 2 * width + 2 * height;
        System.out.println(perimeter);
    }
    
    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle height: " + height;
    }
}