public class Circle {

	private double radius;

	public Circle(double myRadius) {
		radius = myRadius;
	}

    public void setRadius(double myRadius){
        radius = myRadius;
    }

	public double getDiameter() {
		return radius*2;
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return Math.PI*getDiameter();
	}

	public String toString() {
		return "Circle with a radius of " + radius;
	}
}