package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle(double l1, double w1) {
		length = l1;
		width = w1;
		area = l1*w1;
		perimeter = 2*(l1+w1);
	}
	
	public boolean testSquare() {
		boolean test = false;
		if (length == width) {
			test = true;
		}
		return test;
	}
	
	public boolean testSize(double l2, double w2) {
		boolean size = false;
		if (area > l2*w2) {
			size = true;
		}
		return size;
	}
	
	
	public static void main(String[] args) {
		Rectangle n = new Rectangle(6,7);
		System.out.println(n.testSize(5, 8));
		System.out.println(n.testSquare());
		System.out.println(n.area);
	}
	
}
