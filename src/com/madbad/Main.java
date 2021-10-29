package com.madbad;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        Dealers dealers = new Dealers();

        List list = dealers
                .getCar()
                .stream()
                .filter(car -> car.getColor().equals("white"))
                .filter(car -> car.getOdometer()<150000)
                .sorted(Comparator.comparing(Car::getYear))
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
