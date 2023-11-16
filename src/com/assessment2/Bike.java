package com.assessment2;

class Bike {
    String company;
    String type;
    String model;

    public Bike(String company, String type, String model) {
        this.company = company;
        this.type = type;
        this.model = model;
    }
}

class RoadBike extends Bike {
    public RoadBike(String company, String model) {
        super(company, "Road Bike", model);
    }
}

class MountainBike extends Bike {
    public MountainBike(String company, String model) {
        super(company, "Mountain Bike", model);
    }
}

