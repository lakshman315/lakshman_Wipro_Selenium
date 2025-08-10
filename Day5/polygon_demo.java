package Day5;

interface Polygon
{
    double getArea();

    default double getPerimeter(int... sides)
    {
        double perimeter = 0;
        for (int side : sides)
        {
            perimeter += side;
        }
        return perimeter;
    }

    static String shapeInfo() {
        return "A polygon is a plane figure that is described by a finite number of straight line segments connected to form a closed polygonal chain or polygonal circuit.";
    }
}

class Rectangle implements Polygon 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

   
    public double getArea() 
    {
        return length * width;
    }
}

class Triangle implements Polygon 
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getArea() 
    {
        return 0.5 * base * height;
    }
}

public class polygon_demo 
{
    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter (5, 10, 5, 10): " + rectangle.getPerimeter(5, 10, 5, 10));

        System.out.println();

        Triangle triangle = new Triangle(4, 6);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter (4, 5, 3): " + triangle.getPerimeter(4, 5, 3));

        System.out.println();

        System.out.println(Polygon.shapeInfo());
    }
}