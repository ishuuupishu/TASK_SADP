// Parent class
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("The animal makes a sound.");
    }

    protected String getName() {
        return name;
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("The dog barks!");
    }

    public void fetch(String item) {
        System.out.println("The dog fetches " + item + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Animal class
        Animal animal = new Animal("Generic Animal");
        System.out.println("Name: " + animal.getName());
        animal.speak();

        System.out.println();

        // Create an object of the Dog class
        Dog dog = new Dog("Jhony");
        System.out.println("Name: " + dog.getName());
        dog.speak();
        dog.fetch("an apple");
    }
}
