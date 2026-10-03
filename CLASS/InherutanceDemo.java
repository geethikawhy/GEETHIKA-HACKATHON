class A {
    int a = 23;
    void display() {System.out.println("Hello from Parent class " + a);}
    
    }
    class B extends A {
    int b = 8, a = 10;
    void display() {System.out.println("Hello from Child class " + b);}
    void print() {System.out.println("Hello from B : " +a + b);}
    void show () {System.out.println("Hello from B : " +super.a + b);}
    }

public class InherutanceDemo {
       public static void main(String[] args) {
        System.out.println("Hello World!");
        B ob = new B();
        ob.display();
        ob.print();
        ob.show();
    
       }
}

