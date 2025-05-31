package oop_tasks_31May.car_rent_sys;

public class Car {
    private String make;
    private String model;
    private double rentalPrice;
    private boolean available;

    public Car(String m, String mod) {
        this.make = m;
        this.model = mod;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setRentalPrice(double p) {
        if (p >= 0) {
            rentalPrice = p;
        }
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

     public boolean isAvailable() {
        return available;
    }

     public void rentCar() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }
}
