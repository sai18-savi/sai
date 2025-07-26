import java.util.Scanner;

// Abstract class
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void sound();

    // Concrete method
    void display() {
        System.out.println("Animal name: " + name);
    }
}

// Dog inherits Animal
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Implement abstract method
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

// Final class - cannot be extended
final class Cat {
    void meow() {
        System.out.println("Cat says: Meow!");
    }
}

// Uncommenting the below code will cause a compilation error
// class PersianCat extends Cat {} // ❌ Error: Cannot inherit from final class

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dog's name: ");
        String dogName = scanner.nextLine();

        Dog myDog = new Dog(dogName);
        myDog.display();    // from abstract class
        myDog.sound();      // overridden method

        Cat myCat = new Cat();
        myCat.meow();       // from final class

        scanner.close();
    }
}
