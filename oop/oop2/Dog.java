package oop.oop2;

public class Dog {
    String name;
    int age;
    String color;

    public Dog(String name,int age,String color)
    {
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public void bark(){
        System.out.println(name+" can bark");
    }

    public void wag(){
        System.out.println(name+" wags its tail");
    }

    public void printDetails(){
        System.out.println(name+age+color);
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public String getColor()
    {
        return this.color;
    }
}
