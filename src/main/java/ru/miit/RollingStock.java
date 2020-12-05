package ru.miit;

import java.util.ArrayList;

public class RollingStock {
    private Integer lenStockAtConventionalWagons;
    private ArrayList<Wagon> wagonList;

    public RollingStock() {
        wagonList = new ArrayList<>();
    }

    public void setLenStockAtConventionalWagons(Integer lenStockAtConventionalWagons) {
        this.lenStockAtConventionalWagons = lenStockAtConventionalWagons;
    }

    public void setWagonList(ArrayList<Wagon> wagonList) {
        this.wagonList = wagonList;
    }

    public ArrayList<Wagon> getWagonList() {
        return wagonList;
    }

    public Integer getLenStockAtConventionalWagons() {
        return lenStockAtConventionalWagons;
    }

    public void addWagon(Wagon wagon) {
        wagonList.add(wagon);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Wagon wagon: wagonList) {
            stringBuilder.append("ID: ").append(wagon.getId()).append("\n");
            stringBuilder.append("Number: ").append(wagon.getNumber()).append("\n");
            stringBuilder.append("Axis: ").append(wagon.getAxis()).append("\n");
            stringBuilder.append("Len: ").append(wagon.getLen()).append("\n");
            stringBuilder.append("Weight: ").append(wagon.getCargoWeight()).append("\n");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
