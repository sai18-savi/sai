import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    int a, b;

    // Abstract method
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length of Rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = scanner.nextInt();
        Rectangle rect = new Rectangle(length, breadth);
        rect.printArea();

        // Triangle
        System.out.print("Enter base of Triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of Triangle: ");
        int height = scanner.nextInt();
        Triangle tri = new Triangle(base, height);
        tri.printArea();

        // Circle
        System.out.print("Enter radius of Circle: ");
        int radius = scanner.nextInt();
        Circle circ = new Circle(radius);
        circ.printArea();

        scanner.close();
    }
}
