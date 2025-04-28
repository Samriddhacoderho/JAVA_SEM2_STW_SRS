package methods;

public class Example {
    public static void main(String[] args) {
        Example e1=new Example();
        e1.func_example();  //for non static methods
        func_static();
    }

    public void func_example()
    {
        System.out.println("Hello World");
    }

    public static void func_static()
    {
        System.out.println("Bye World");
    }
}
