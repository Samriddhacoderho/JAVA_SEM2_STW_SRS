package oop.polymorphism;



//Polymorphism: having many forms
//objects of different classes to be treated as objects of same superclass
// 2. Method Overriding
public class First{
    // 1. Method Overloading
    // Same method name but different length or datatype of parameters
    public void add(int a, int b){
        System.out.println("Two params");
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println("Three params");
        System.out.println(a+b+c);
    }

    //2 and 3 has different datatype as arguments
    public void add(int a,int b,String c)
    {
        System.out.println("two int and a string param");
        System.out.println(a+b);
    }

    class Imp1{
        public static void main(String[] args) {
            First polyFirst=new First();
            polyFirst.add(5, 10);
            polyFirst.add(5, 10, 15);
            polyFirst.add(5, 10, "Hello");
        }
    }
}
 