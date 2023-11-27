package com.arrays.examples;

interface Bike {
    void speedUp(int increment); // Method to increase speed
    void applyBrakes(int decrement); // Method to apply brakes
    void displaySpeed(); // Method to display speed
}

// Class implementing Bike interface
class MountainBike implements Bike {
    private int speed; // Private speed variable for MountainBike

    // Constructor to initialize speed to 0
    public MountainBike() {
        speed = 0;
    }

    // Method to increase speed by a specified increment
    public void speedUp(int increment) {
        speed += increment;
    }

    // Method to apply brakes by a specified decrement
    public void applyBrakes(int decrement) {
        if (speed - decrement >= 0) {
            speed -= decrement;
        } else {
            speed = 0;
        }
    }

    // Method to display current speed
    public void displaySpeed() {
        System.out.println("Current Speed: " + speed + " mph");
    }
}