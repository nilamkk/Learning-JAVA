package com.company;

// Keep an "I" before the name of an interface, it helps to understand that it is an interface.
public interface ITelephone {

    // functions in interface are public by default
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
