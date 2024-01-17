package javaLabsheet9;

public class Circle {
	// the public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	// The private 2 attributes
	private	double radius;
	private		String color  ;
		// constructs a circle with default radius and color
				// 1st(default) constructor
	Circle(){			
	this.radius = DEFAULT_RADIUS;
	this.color = DEFAULT_COLOR;
	
	}
	//
	//
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//
	//
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	//Return the radius-the public getter for private attribute radius
	public double getRadius( ) {
		return this.radius;
	}
	//Set the radius-the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String setColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color= color;}
	//Return a self-descriptive string for a circle
	public String toString() {
		return "Cricle[radus= "+this.radius+", color = "+color+"]";
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
		//return math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2.0 * Math.PI *radius;
	}
}
