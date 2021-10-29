package com.madbad;
import java.util.ArrayList;
import java.util.List;

public class Dealers {

    private List<Car> car;

    public Dealers() {
        initArray();
    }

    public List<Car> getCar() {
        return car;
    }

    private void initArray() {
        car = new ArrayList<>();

        car.add(new Car("niva", "red", 2015, 82582));
        car.add(new Car("GTR", "white", 2008, 31535));
        car.add(new Car("Polo", "white", 2013,126784));
        car.add(new Car("duster", "black", 2015, 87458));
        car.add(new Car("kalina", "yellow", 2007, 257987));
        car.add(new Car("x-trail", "black", 2020, 86849));
        car.add(new Car("tiguan", "white", 2017,64920));
        car.add(new Car("logan", "white", 2012, 457291));
    }
}
