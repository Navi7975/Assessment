package com.assessment4;

//Abstract class Vehicle
abstract class Vehicle {
 protected String type;

 public Vehicle(String type) {
     this.type = type;
 }

 // Abstract method for displaying vehicle information
 abstract void displayInfo();
}

//Car class extending Vehicle
class Car extends Vehicle {
 private String brand;
 private String model;

 public Car(String brand, String model) {
     super("Car");
     this.brand = brand;
     this.model = model;
 }

 // Implementing displayInfo method for Car
 @Override
 void displayInfo() {
     System.out.println("Car Type: " + type);
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
 }
}

//Bicycle class extending Vehicle
class Bicycle extends Vehicle {
 private String color;

 public Bicycle(String color) {
     super("Bicycle");
     this.color = color;
 }

 // Implementing displayInfo method for Bicycle
 @Override
 void displayInfo() {
     System.out.println("Bicycle Type: " + type);
     System.out.println("Color: " + color);
 }
}