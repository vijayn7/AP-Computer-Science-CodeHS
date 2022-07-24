public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        width = w;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height = h;
    }

    public String toString(){
        return "Rectangle with width " + width + " and height " + height;
    }
}