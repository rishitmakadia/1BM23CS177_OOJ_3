// Demonstrating Packages, Interfaces, and their concepts

// Define a package
//package example;

// Interface with various methods
interface DemoInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in the interface called.");
        privateHelper();
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in the interface called.");
    }

    // Private method
    private void privateHelper() {
        System.out.println("Private helper method in the interface executed.");
    }
}

// Another interface to demonstrate multiple inheritance in interfaces
interface AnotherInterface {
    void anotherAbstractMethod();

    default void anotherDefaultMethod() {
        System.out.println("Default method in AnotherInterface called.");
    }
}

// Class implementing interfaces
class ImplementingClass implements DemoInterface, AnotherInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method from DemoInterface implemented.");
    }

    @Override
    public void anotherAbstractMethod() {
        System.out.println("Abstract method from AnotherInterface implemented.");
    }

    // Overriding a default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in ImplementingClass called.");
    }
}

// Main class
public class CIE_22 {
    public static void main(String[] args) {
        // Create an object of the implementing class
        ImplementingClass obj = new ImplementingClass();

        System.out.println("\nCalling methods on the object:");
        obj.abstractMethod(); // Abstract method
        obj.anotherAbstractMethod(); // Abstract method from AnotherInterface
        obj.defaultMethod(); // Overridden default method
        obj.anotherDefaultMethod(); // Default method from AnotherInterface

        System.out.println("\nCalling static method from interface:");
        DemoInterface.staticMethod(); // Static method from DemoInterface (Important)

        System.out.println("\nDemonstrating encapsulated behavior via private methods:");
        obj.defaultMethod(); // Indirectly uses privateHelper inside the default method
    }
}
