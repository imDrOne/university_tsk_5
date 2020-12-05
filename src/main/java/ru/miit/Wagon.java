package ru.miit;

import java.util.UUID;

public class Wagon {
    private UUID id;
    private Integer number;
    private Integer axis;
    private Integer cargoWeight;
    private Integer len;

    public Wagon(UUID id, Integer number, Integer axis, Integer cargoWeight, Integer len) {
        this.id = id;
        this.number = number;
        this.axis = axis;
        this.cargoWeight = cargoWeight;
        this.len = len;
    }

    public Integer getAxis() {
        return axis;
    }

    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public Integer getNumber() {
        return number;
    }

    public UUID getId() {
        return id;
    }

    public Integer getLen() {
        return len;
    }

    public void setAxis(Integer axis) {
        this.axis = axis;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setLen(Integer len) {
        this.len = len;
    }
}
