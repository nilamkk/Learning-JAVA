package com.company;

public class Car {
    private String model;
    private int price;
    private String name;
    private int highestSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighestSpeed() {
        return this.highestSpeed;
    }

    public void setHighestSpeed(int highestSpeed) {
        this.highestSpeed = highestSpeed;
    }
}
