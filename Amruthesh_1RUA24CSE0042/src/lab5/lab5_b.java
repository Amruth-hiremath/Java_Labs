package lab5;

class Shape{
	void calculateArea() {
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	void calculateArea() {
		double area = length * width;
		System.out.println("Area of rectangle is: " + area);
	}
}

class Circle extends Shape{
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	void calculateArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is: " + area);
	}
}


public class lab5_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle(10,20);
		Shape s2 = new Circle(5);
		s1.calculateArea();
		s2.calculateArea();
	}
}
