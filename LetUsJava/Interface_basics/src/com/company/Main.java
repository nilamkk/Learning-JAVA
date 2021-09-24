package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone telephone; // cant create an instance of an interface. only we can create a reference variable to refer to the class which implements this interface.
        telephone= new DeskPhone(9678103,false);
        telephone.powerOn(); // calling the function in interface but executing the body in the calss
        System.out.println(telephone.isRinging());
    }
}
