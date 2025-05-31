package oop_tasks_31May.car_rent_sys;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Land Cruiser V8");
        c.setRentalPrice(45.99);
        
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getRentalPrice());
        System.out.println(c.isAvailable());
        
        c.rentCar();
        System.out.println(c.isAvailable());
        
        c.returnCar();
        System.out.println(c.isAvailable());
    }
}
