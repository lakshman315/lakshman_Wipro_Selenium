package dAY6;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        int fahrenheitInt = (int) fahrenheit;

        System.out.println("Precise Fahrenheit value (double): " + fahrenheit);
        System.out.println("Truncated Fahrenheit value (int): " + fahrenheitInt);
        
        sc.close();
    }
}

