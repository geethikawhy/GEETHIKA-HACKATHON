
class A {
    int a=10;
    void displayA() {
        System.out.println("Hello from A! " + a);}}
class B extends A {
    int b=20;
    void displayB() {System.out.println("Hello from B! " +a +" "+ b);}} 
class C extends B {
    int c=9;
    void displayC() { System.out.println("Hello from C! " +a +" "+ b +" "+ c);}}               
class InheritanceDemo {
    public static void main(String args[]) {
        System.out.println("Hello from main!");
        C ob = new C();
        ob.displayC();
        ob.displayB();
        ob.displayA();
         
        }
    }
