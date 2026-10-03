class GrandParentA
{
    int a = 10;
}

interface ParentB
{
    int b = 18;
}

class ChildC extends GrandParentA 
{
    int c = 10;

    void display()
    {
        System.out.println("Hello from ChildC : " + a + " " + c);
    }
}

class MultipleInherit
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        ChildC ob = new ChildC();
        ob.display();
    }
}
