package oop.oop7;

import oop.oop4.Animal;

public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        human.eat();
        human.walk();
        human.talk();

        MyAnimal animal=new MyAnimal();
        animal.eat();
    }
}
