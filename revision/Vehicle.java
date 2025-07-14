package revision;

public class Vehicle {
    String brand;

    public Vehicle(String brand)
    {
        this.brand=brand;
        System.out.println("Vehicle constructor called for");
    }

    void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    String model;

    public Car(String brand,String model)
    {
        super(brand);
        this.model=model;
        System.out.println("Car constructor called");
    }

    @Override
    void start()
    {
        System.out.println("Car is starting");
        System.out.println(model+brand);
    }
}

class Main{
    public static void main(String[] args) {
        Car car=new Car("Toyota", "Land Cruiser");
        car.start();
    }
}



