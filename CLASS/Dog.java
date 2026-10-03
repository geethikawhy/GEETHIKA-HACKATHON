class Animal {
    void eat() {
        System.out.println("This animal is eats food");
    }
}
class Mammal extends Animal {
    void breathe() {
        System.out.println("This mammal is breaths air");
    }
}
public class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks");
    }


public static void main(String[] args) {
    Dog mydog = new Dog(); //Create an object of the bottom most subclass
    mydog.eat();           //Inherited from animal (Grandparent class)
    mydog.breathe();       //Inherited from mammal (Parent class)
    mydog.bark();          //Defined in Dog class (child class)
}
}
