package com.company;

public class Sparrow extends Bird{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
