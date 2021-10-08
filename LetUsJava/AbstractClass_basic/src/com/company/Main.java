package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog= new Dog("Siro");
        Sparrow sp= new Sparrow("Chiko");
        Ostrich ost= new Ostrich("Lazy bird");

        dog.eat();
        dog.breathe();

        sp.eat();
        sp.breathe();
        sp.fly();

        ost.eat();
        ost.breathe();
        ost.fly();
    }
}
