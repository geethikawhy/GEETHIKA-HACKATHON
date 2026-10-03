class ConstructorA{
int a,b;
ConstructorA (){
    a=16;b=20;
    System.out.println("from constructor A");
}
ConstructorA(int x,int y){
    a=x;b=y;
    System.out.println("from constructor A with parameters");
}

public class MainConstructor {
    
    public static void main(String[] args) {
        System.out.println("Hello world from main");
        ConstructorA obj = new ConstructorA();
        ConstructorA obj2 = new ConstructorA(5, 4);
        ConstructorA obj3 = new ConstructorA();System.out.println("obj.a="+obj.a+" obj2.b="+obj2.b +" obj3.b="+obj3.b);    
        obj3.b=25;
        System.out.println("obj.a="+obj3.b);
    }
}
}
