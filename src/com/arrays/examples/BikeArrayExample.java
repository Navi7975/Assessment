package com.arrays.examples;


public class BikeArrayExample {
    public static void main(String[] args) {
        // Single array of MountainBike objects
        MountainBike[] bikes = new MountainBike[3];
        for (int i = 0; i < bikes.length; i++) {
            bikes[i] = new MountainBike(); // Initialize each element with a new MountainBike instance
        }

        // Multi-dimensional array of MountainBike objects
        MountainBike[][] garage = new MountainBike[2][2];
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage[i].length; j++) {
                garage[i][j] = new MountainBike(); // Initialize each element with a new MountainBike instance
            }
        }

        // Jagged array of MountainBike objects
        MountainBike[][] showroom = new MountainBike[3][];
        showroom[0] = new MountainBike[2];
        showroom[1] = new MountainBike[1];
        showroom[2] = new MountainBike[3];

        // Initialize bikes in the showroom
        for (int i = 0; i < showroom[0].length; i++) {
            showroom[0][i] = new MountainBike(); // Initialize each element with a new MountainBike instance
        }
        showroom[1][0] = new MountainBike();
        for (int i = 0; i < showroom[2].length; i++) {
            showroom[2][i] = new MountainBike(); // Initialize each element with a new MountainBike instance
        }

        // Manipulate bikes in arrays
        bikes[0].speedUp(10);
        bikes[1].speedUp(15);
        bikes[2].speedUp(20);

        garage[0][0].applyBrakes(5);
        garage[1][1].speedUp(30);

        showroom[0][1].applyBrakes(8);
        showroom[2][2].speedUp(25);

        // Display speeds of bikes
        for (MountainBike bike : bikes) {
            bike.displaySpeed();
        }

        for (MountainBike[] row : garage) {
            for (MountainBike bike : row) {
                if (bike != null) {
                    bike.displaySpeed();
                }
            }
        }

        for (MountainBike[] row : showroom) {
            for (MountainBike bike : row) {
                if (bike != null) {
                    bike.displaySpeed();
                }
            }
        }
    }
}
