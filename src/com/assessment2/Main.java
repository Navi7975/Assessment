package com.assessment2;


public class Main {
    public static void main(String[] args) {
        Bike offRoadBike = new MountainBike("himalayan ", "BS6");
        Bike roadBike = new RoadBike("NS200", "BS6");

        if (offRoadBike instanceof Bike) {
            System.out.println("offRoadBike is an instance of Bike");
        }

        if (roadBike instanceof Bike) {
            System.out.println("roadBike is an instance of Bike");
        }
    }
}

