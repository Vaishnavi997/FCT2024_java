package abstracttest;

public class AbstractTest {
	public static void main(String[] args) {
		

	Rectangle rectangle1 = new Rectangle(5,10);
	rectangle1.draw();
	rectangle1.calcArea();
	
	Circle circle1 = new Circle(45);
	circle1.draw();
	circle1.calcArea();
	
	System.out.println("----------");
	
	Square square = new Square(45);
	square.draw();
	square.calcArea();
	
	}
}
 /* abstract class

- may or may not have abstract methods

- it is MEANT for inheritance

- the immediate non-abstract class MUST implement the abstract
  method of this class
  
- Abstract class cannot be instantiated

- the main purpose of abstract class is to impose some
business principles on the upcoming child class/es

abstract class mdhe jr normal declaration method lihili tr te error denar(child class mdhe access nahi honar)
but jr normal metod ch implementaon tyatch dil tr ti child mdhe access honar..
  
*/

abstract class GeometricalShape
{
	abstract void draw(); //abstract | incomplete | partial contract
	abstract void calcArea();
	
}
class Rectangle extends GeometricalShape{
	float length;
	float width;
	
	Rectangle(float l,float w) {
		length =l;
		width=w;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Rectangle : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Square : calcArea() : Calculating the area of the Rectangle...");
		float area = length* width;
		System.out.println("Rectangle : area       : "+area);
	}
}

class Circle extends GeometricalShape
{
	float radius;
	private static final float PI=3.14f;
	
	Circle(float r) {
		radius = r;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Circle : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Circle : calcArea() : Calculating the area of the Circle....");
		float area = PI * radius * radius;
		System.out.println("Circle : area       : "+area);
	}
}

class Square extends GeometricalShape
{
	float side;
	
	Square(float r) {
		side = r;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Square : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Square : calcArea() : Calculating the area of the Square....");
		float area = side * side;
		System.out.println("Square : area       : "+area);
	}
}
