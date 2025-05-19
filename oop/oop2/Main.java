package oop.oop2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog[] dogObj = new Dog[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            String color = sc.nextLine();
            dogObj[i] = new Dog(name, age, color);
            System.out.println(dogObj[i].getName());
            System.out.println(dogObj[i].getAge());
            System.out.println(dogObj[i].getColor());
        }
    }
}

