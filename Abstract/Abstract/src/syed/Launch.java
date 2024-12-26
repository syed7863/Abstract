package syed;
abstract class Shape {
 abstract double calculateArea();
 abstract double calculatePerimeter();

 
 void displayDetails() {
     System.out.println("Area: " + calculateArea());
     System.out.println("Perimeter: " + calculatePerimeter());
 }
}

class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 
 double calculateArea() {
     return length * width;
 }

 
 double calculatePerimeter() {
     return 2 * (length + width);
 }
}


class Circle extends Shape {
 private double radius;

 
 Circle(double radius) {
     this.radius = radius;
 }

 
 double calculateArea() {
     return Math.PI * radius * radius;
 }

 
 double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

public class Launch {
 public static void main(String[] args) {
     
     Shape rectangle = new Rectangle(5.0, 3.0);
     System.out.println("Rectangle Details:");
     rectangle.displayDetails();

     
     Shape circle = new Circle(4.0);
     System.out.println("\nCircle Details:");
     circle.displayDetails();
 }
}