package Practice;

class Animals {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}
class Dogs {
    private Animals animals; // Composition: Dog "has an" Animal

    Dogs() {
        this.animals = new Animals(); // Creating an instance of Animal within Dog
    }
    void makeSound() {
        animals.makeSound(); // Delegating makeSound() method to the Animal object
    }
}
public class Composition {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.makeSound(); // This will call the makeSound() method of the contained Animal object
    }
}
