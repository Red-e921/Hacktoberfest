// Example of Polymorphism in Java
// Compile-time (Method Overloading) + Runtime (Method Overriding)

class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Calculator {
    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // -------- Runtime Polymorphism (Overriding) --------
        Animal a; // Reference variable of parent type

        a = new Dog();
        a.sound();  // Dog barks

        a = new Cat();
        a.sound();  // Cat meows

        // -------- Compile-time Polymorphism (Overloading) --------
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 int: " + calc.add(5, 10));
        System.out.println("Sum of 2 double: " + calc.add(3.5, 2.5));
        System.out.println("Sum of 3 int: " + calc.add(2, 4, 6));
    }
}
