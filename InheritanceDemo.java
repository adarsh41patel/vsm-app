class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat(); // Inherited method
        myDog.bark(); // Subclass-specific method
    }

}
