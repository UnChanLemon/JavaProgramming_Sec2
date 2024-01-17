package javaLabsheet9;

public class Testcircle {

	public static void main(String[] args) {
		//Test All constructors and toString()
		Circle c1 = new Circle(1.1,"blue"); //call 3nd constructor
		System.out.println(c1);
		System.out.println();
		
		Circle c2 = new Circle(2.2); 
		System.out.println(c2);
		System.out.println();
		
		Circle c3 = new Circle();
		System.out.println(c3);
		System.out.println();
		
		//Test Setters and getters
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println(c1);
		System.out.println("the radius of c1 is: "+c1.getRadius());
		System.out.println("the color of c1 is: "+c1.setColor());
		
		//test getArea() and getCirumferfnce()
		System.out.printf("The area is: %.2f%n", c1.getArea());
		System.out.printf("The circumference is: %.3f", c1.getCircumference());
		
	}

}
