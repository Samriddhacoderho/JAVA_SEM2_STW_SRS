package oop.oop5;

public class Main {
    public static void main(String[] args) {
        Laptop macbook=new Laptop();
        macbook.openApp();
        macbook.closeApp();
        macbook.setColor("silver");
        System.out.println(macbook.getColor());
    }
}


//identity-- name: macbook
//properties-- attributes: color, model, price
//behaviors-- methods openApp, closeApp, getColor, setColor, getModel, setModel, getPrice, setPrice


