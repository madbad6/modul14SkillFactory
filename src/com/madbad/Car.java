package com.madbad;


public class Car {

    private String model;
    private String color;
    private int year;
    private int odometer;

    public Car(String model, String color, int year, int odometer) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.odometer = odometer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    @Override
    public String toString() {
        return  "model: " + model +
                ", color: " + color +
                ", year: " + year +
                ", odometer: " + odometer;
    }
}
