public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
       super(sideLength, sideLength);
    }

    // Return either the width or height from the superclass
    public double getSideLength(){
        return super.getWidth();
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){
        super.setHeight(sideLength);
        super.setWidth(sideLength);
    }
    
    // Get the width and/or the height from the superclass
    public double area(){
      return super.getHeight() * super.getWidth();
    }

    // Override to read: Square with side lengths ______
    @Override
    public String toString(){
        return "Square with side lengths " + getWidth();
    }
}