package oop_hw_2June;



class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    void setValues(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.1416 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.1416 * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setValues(5, 4);
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());

        Circle c = new Circle();
        c.setRadius(3);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Circumference: " + c.calculateCircumference());
    }
}
