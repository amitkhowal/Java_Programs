package Practice;

// Base Class
class Animal1 {
    void eat() {
        System.out.println("eat() method of base class");
        System.out.println("Animal is eating.");
    }
}
class Dog1 extends Animal1 {
    void eat() {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}
public class Method_Overriding {
    public static void main(String args[]) {
        Dog1 d1 = new Dog1();
        Animal1 a1 = new Animal1();

        d1.eat();
        a1.eat();

        // Polymorphism: Animal reference pointing to Dog object
        Animal1 animal1 = new Dog1();

        // Calls the eat() method of Dog class
        animal1.eat();
    }
}
