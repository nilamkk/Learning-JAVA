package com.company;

public class Ostrich extends Bird{
    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " cant fly");
    }
}
