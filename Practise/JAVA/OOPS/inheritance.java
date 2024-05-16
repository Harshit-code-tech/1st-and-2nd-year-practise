package OOPS;
// The superclass
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Animal speaks");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

// The subclass inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }

    // Overriding the speak() method from the superclass
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class inheritance
 {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog("Buddy", 3, "Labrador");

        // Access properties and methods from the superclass (Animal)
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);
        dog.eat(); // Output: Animal eats

        // Access methods from the subclass (Dog)
        dog.speak(); // Output: Dog barks
        dog.fetch(); // Output: Dog fetches the ball
    }
}
/*
In this example, we have a superclass called Animal, representing common properties and behaviors of animals.
 It has two instance variables, name and age, and two methods, speak() and eat().

Then, we have a subclass called Dog, which extends the Animal class.
 The Dog class has an additional instance variable breed and overrides the speak() method to provide a specific implementation for dogs.
 It also has a unique method fetch().

In the main() method, we create an instance of the Dog class and demonstrate how it can access both
 the properties and methods of the superclass (Animal) and its own unique methods. This illustrates the concept of inheritance,
 where the Dog class inherits the properties and methods of the Animal class and extends it with its own specific characteristics.
 */
