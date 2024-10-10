import java.util.Scanner;

public class myFirstFunc {
    public static void main(String[] args) {
        System.out.println(getDog());  // This will now work after defining the Dog class
    }

    public static Dog getDog() {
        return new Dog("Bulldog");  // Returns a Dog object with the breed "Bulldog"
    }
}

class Dog {
    String breed;

    // Constructor to initialize the breed of the Dog
    public Dog(String breed) {
        this.breed = breed;
    }

    // Override toString() to customize the output when a Dog object is printed
    @Override
    public String toString() {
        return "Dog breed: " + breed;
    }
}
