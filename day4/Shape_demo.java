package day4;

class Shape 
{
	double area() 
	{
		System.out.println("Area of the shape");
		return 0;
	}
}

class Circle extends Shape 
{
	private double radius;
 	public Circle(double radius) 
 	{
 		this.radius = radius;
 	}
 	double area() 
 	{
     	double area = Math.PI * radius * radius;
     	System.out.println("Area of the circle: " + area);
		return area;
 	}
}

class Rectangle extends Shape
{
	private double length;
	private double width;
 	public Rectangle(double length, double width) 
 	{
 		this.length = length;
 		this.width = width;
 	}
 	double area()
 	{
	 	double area = length * width;
	 	System.out.println("Area of the rectangle: " + area);
		return area;
 	}
}

public class Shape_demo 
{
	public static void main(String[] args) 
	{
		Shape circle = new Circle(6);
		circle.area();
		Shape rectangle = new Rectangle(4, 6);
		rectangle.area(); 
	}
}

