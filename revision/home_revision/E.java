package revision.home_revision;

// 5. You are building a shape hierarchy for a drawing application. Design an abstract class named "Draw" with the following abstract methods:

// calculateVolume(): This method should calculate and return the area of the shape

// calculateArea(): This method should calculate and return the area of the shape.

// calculatePerimeter(): This method should calculate and return the perimeter of the shape.

//Implement the abstract class and provide concrete implementations for the abstract methods. Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder." Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape. Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters.

public class E{
    public static void main(String[] args){
        Cube cubeObj=new Cube(4.2);
        Cuboid cuboidObj=new Cuboid(2,3,4);
        Cylinder cylinderObj=new Cylinder(2,3);
        
        System.out.println("Calculation of Cube:");
        System.out.println(cubeObj.calculateVolume());
        System.out.println(cubeObj.calculateArea());
        System.out.println(cubeObj.calculatePerimeter());
        
        System.out.println("Calculation of Cuboid:");
        System.out.println(cuboidObj.calculateVolume());
        System.out.println(cuboidObj.calculateArea());
        System.out.println(cuboidObj.calculatePerimeter());
        
        System.out.println("Calculation of Cylinder:");
        System.out.println(cylinderObj.calculateVolume());
        System.out.println(cylinderObj.calculateArea());
        System.out.println(cylinderObj.calculatePerimeter());

    }
}

abstract class Draw{

    private double length;
    private double breadth;
    private double height;
    private double radius;
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Draw(double length){
        this.length=length;
    }
    
    public Draw(double length, double breadth, double height) {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public Draw(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw{    
    public Cube(double length){
        super(length);
    }
    
    @Override
    public double calculateVolume(){
        return (super.getLength()*super.getLength()*super.getLength());
    }
    
    @Override
    public double calculateArea(){
        return (super.getLength()*super.getLength());
    }
    
    @Override
    public double calculatePerimeter(){
        return (6*super.getLength());
    }
}

class Cuboid extends Draw{
    
    public Cuboid(double length,double breadth,double height){
        super(length,breadth,height);
    }
    
    @Override
    public double calculateVolume(){
        return (super.getHeight()*super.getBreadth()*super.getLength());
    }
    
    @Override
    public double calculateArea(){
        return (super.getLength()*super.getBreadth());
    }
    
    @Override
    public double calculatePerimeter(){
        return (2*(super.getLength()+super.getBreadth()+super.getHeight()));
    }
}

class Cylinder extends Draw{
    
    public Cylinder(double radius,double height){
        super(radius,height);
    }
    @Override
    public double calculateVolume(){
        return (3.14*super.getRadius()*super.getRadius()*super.getHeight());
    }
    
    @Override
    public double calculateArea(){
        return (3.14*super.getRadius()*super.getRadius());
    }
    
    @Override
    public double calculatePerimeter(){
        return (2*3.14*super.getRadius());
    }
}