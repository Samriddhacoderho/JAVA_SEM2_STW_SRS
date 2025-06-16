package oop.abstraction;

abstract class Furniture {
    // abstraction bhaneko process of hiding implementation details and showing only
    // functionality to users.
    // 1) Abstraction garne duita tarika: By making abstract class(Achieves 0 to
    // 100% abstraction),By making interface(100%) abstraction
    // abstract keyword is used to create abstract class and abstract methods

    // kunai pani abstract class ko object banauna mildaina

    public Furniture()
    {
        System.out.println("Furniture called");
    }
    abstract void greet();
}

class Closet extends Furniture {

    public Closet()
    {
        System.out.println("Closet Called");
    }

    @Override
    void greet() {
        System.out.println("Greed is abstracted method");
    }

}

class implementation {
    // Furniture furniture=new Furniture(); //not allowed



    public static void main(String[] args) {
        Closet fCloset = new Closet();
        fCloset.greet();
    }

}
