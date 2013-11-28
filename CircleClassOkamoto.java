/* A class that represents a circle with a radius, area, and perimeter. It includes methods to set these fields. This is HW assignment #29
*/

public class CircleClassOkamoto {
	private double radius;
	private double area;
	private double perimeter;


	public static void main (String [] args){
		CircleClassOkamoto test = new CircleClassOkamoto (4);
		System.out.println ("Perimeter: " + test.getPerimeter());
		System.out.println ("Area: " + test.getArea()); 
	}

	// Default constructor. 
	public CircleClassOkamoto () {
		setRadius(1);
	} 

	public CircleClassOkamoto (double rad) {
		setRadius(rad);
	}

	// Sets radius and updates perimeter and area to match it. 
	public void setRadius (double rad) {
		radius = rad;
		perimeter = radius * 2 * Math.PI;
		area = Math.PI*Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
}