package oop.oop7;

public class Human extends MyAnimal {

    public Human()
    {
        System.out.println("Human constructor non parameterized");
    }
    public void talk()
    {
        System.out.println("Human talks");
    }

    public void walk()
    {
        super.walk();
        System.out.println("Human surely walks");
    }
}


