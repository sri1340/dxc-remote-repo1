public class Circle {
	double radius;
	public Circle(double radius) {
	this.radius=radius;
	}
	public double area() {
		System.out.println(" in area");
		return 3.14*radius*radius;
	}
}
