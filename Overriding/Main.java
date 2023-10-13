package Overriding;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    // @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat(); // Create an instance of Cat, assigned to an Animal reference
        animal.makeSound(); // Calls the overridden method in Cat
        Animal animal1 = new Animal();
        animal1.makeSound();
        Cat cat = new Cat(); // Create an instance of Cat
        cat.makeSound(); // Calls the overridden method in Cat
    }
}
