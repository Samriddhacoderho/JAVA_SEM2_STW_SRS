package oop.oop7;

public class MyAnimal {

    public MyAnimal()
    {
        System.out.println("Animal Constructor non parameterized");
    }

    public MyAnimal(int age)
    {
        System.out.println("Animal Constructor parameterized");
    }
    
    public void eat()
    {
        System.out.println("Animal eats");
    }

    public void walk()
    {
        System.out.println("Animal might walk");
    }
}
