package ru.miit;

import java.util.ArrayList;
import java.util.UUID;

public class App {
    public static void main(String[] args) {

        RollingStock rollingStock = new RollingStock();

        Wagon firstWagon = new Wagon(UUID.randomUUID(), 1, 4, 10, 20);
        Wagon secondWagon = new Wagon(UUID.randomUUID(), 2, 4, 25, 10);
        Wagon thirdWagon = new Wagon(UUID.randomUUID(), 3, 4, 71, 50);

        rollingStock.addWagon(firstWagon);
        rollingStock.addWagon(secondWagon);
        rollingStock.addWagon(thirdWagon);

        System.out.println(rollingStock.toString());

        System.out.println("Hello, World!");
    }
}
