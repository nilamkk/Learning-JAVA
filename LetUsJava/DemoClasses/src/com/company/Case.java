package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimensions nativeDimensions;

    public Case(String model, String manufacturer, int powerSupply, Dimensions nativeDimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.nativeDimensions = nativeDimensions;
    }

    public void pressPowerButton(){
        System.out.println("Pressed !!!");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getNativeDimensions() {
        return nativeDimensions;
    }
}
