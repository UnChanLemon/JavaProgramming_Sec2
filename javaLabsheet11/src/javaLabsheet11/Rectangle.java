package javaLabsheet11;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	Rectangle(double width, double length, String color){
		super(color);
		this.width = width;
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	
	@Override
	public String toString() {
		return "rectangle[width = "+ this.width+",Length= "+this.length+","+
	super.toString()+ "]";
	}

}
