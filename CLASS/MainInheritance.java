class Animal {
    void eat() {
        System.out.println("eats ");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("dog barks");
    }
}
public class MainInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method 
        dog.bark(); // child method 
    }

}
