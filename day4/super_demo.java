package day4;

class Animal 
{
    String name;

    Animal(String name) 
    {
        this.name = name;
    }

    void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal 
{
    String breed;

    Dog(String name, String breed) 
    {
        super(name); 
        this.breed = breed;
    }
    void sound() 
    {
        super.sound(); 
        System.out.println("Dog barks");
    }

    void printInfo() 
    {
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + breed);
    }
}

public class super_demo {
    public static void main(String[] args) 
    {
        Dog dog = new Dog("Lucky", "German Shepherd");
        dog.sound();
        dog.printInfo();
    }
}
