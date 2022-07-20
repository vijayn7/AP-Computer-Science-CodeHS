public class CircleTester {

	public static void main(String[] args) {

		Circle circ = new Circle(10);

        circ.setRadius(5);
        
        System.out.println(circ);

        System.out.println("The diameter is " + circ.getDiameter());
        System.out.println("The perimeter is " + circ.getPerimeter());

	}

}