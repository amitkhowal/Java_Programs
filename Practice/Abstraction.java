package Practice;

abstract class Shape {
        // Abstract method (does not have a body)
        abstract void draw();

        // Regular method
        void description() {
            System.out.println("This is a shape.");
        }
    }
    // Concrete class
    class Circle extends Shape {
        // Implementing the abstract method
        void draw() {
            System.out.println("Drawing a circle.");
        }
    }
    // Another concrete class
    class Rectangle extends Shape {
        // Implementing the abstract method
        void draw() {
            System.out.println("Drawing a rectangle.");
        }
    }
    // Driver class
    public class Abstraction {
        public static void main(String[] args) {
            // Create objects of Circle and Rectangle
            Shape circle = new Circle();
            Shape rectangle = new Rectangle();

            // Call the draw method
            circle.draw();         // Output: Drawing a circle.
            rectangle.draw();      // Output: Drawing a rectangle.

            // Call the description method
            circle.description();  // Output: This is a shape.
            rectangle.description(); // Output: This is a shape.
        }
    }







