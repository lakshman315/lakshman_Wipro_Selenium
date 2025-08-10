package day9;

import java.util.*;

class Product implements Comparable<Product> 
{
    private String name;
    private double price;

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    
    public int compareTo(Product other) 
    {
        return Double.compare(this.price, other.price);
    }

  
    public String toString() 
    {
        return name + " - $" + price;
    }
}

public class Comparable_product{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000));
        products.add(new Product("Smartphone", 35000));
        products.add(new Product("Tablet", 20000));
        products.add(new Product("Headphones", 2500));

        System.out.println("Before Sorting:");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products); 

        System.out.println("\nAfter Sorting by Price (Ascending):");
        for (Product p : products) 
        {
            System.out.println(p);
        }
    }
}
