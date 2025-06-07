package oop_hw_2June;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;
    
    public Square(double s) {
        this.side = s;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double r) {
        this.radius = r;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Square s = new Square(5);
        Circle c = new Circle(3);
        
        System.out.println("Rectangle area: " + r.calculateArea());
        System.out.println("Square area: " + s.calculateArea());
        System.out.println("Circle area: " + c.calculateArea());
    }
}
