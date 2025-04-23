//3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

package week2_tasks;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println("Area of triangle is:"+(0.5*base*height));
        System.out.println("Area of cube is:"+(Math.pow(length, 3)));
        System.out.println("Area of cuboid is:"+(length*breadth*height));
        sc.close();        
    }
}
