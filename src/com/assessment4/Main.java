package com.assessment4;

public class Main {
	 public static void main(String[] args) {
	        Car car = new Car("Toyota", "Camry");
	        Bicycle bicycle = new Bicycle("Red");

	        System.out.println("--- Car Information ---");
	        car.displayInfo();

	        System.out.println("--- Bicycle Information ---");
	        bicycle.displayInfo();
	    }
}
