package day4;

public class Calculator 
{
        
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    public double add(double a, double b) 
    {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add(5, 7): " + calc.add(5, 7));           
        System.out.println("add(5, 7, 9): " + calc.add(5, 7, 9));      
        System.out.println("add(2.5, 3.5): " + calc.add(2.5, 3.5));    
    }
}
