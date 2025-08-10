package day7;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ModifyObjectDemo {
   
    static void changePerson(Person p) 
    {
        p.name = "Pavan";
        p.age = 30;
    }

    public static void main(String[] args) {
        Person person = new Person("Lakshman", 25);
        System.out.println("Before change:");
        person.display();

       
        changePerson(person);

        System.out.println("After change:");
        person.display();
    }
}

