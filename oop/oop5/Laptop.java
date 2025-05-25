package oop.oop5;

public class Laptop {
    String color;
    String model;
    double price;

    public void openApp()
    {
        System.out.println(model+" opening:");
    }

    public void closeApp()
    {
        System.out.println(model+" closing:");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


