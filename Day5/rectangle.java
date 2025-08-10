package Day5;


public class rectangle {
   
    private int width;
    private int height;
    
    public rectangle(int width, int height) 
    {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width setting the value as 1.");
            this.width = 1; 
        }
    }
 
    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height setting the value as 1.");
            this.height = 1;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
 
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        rectangle x = new rectangle(2, 5);
        x.displayDetails();

        System.out.println("\nCreating rectangle with invalid values:");
        rectangle y = new rectangle(-3, 0);
        y.displayDetails();
    }
}
