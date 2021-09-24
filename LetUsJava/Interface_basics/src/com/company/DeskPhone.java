package com.company;

public class DeskPhone implements ITelephone{
    private int phoneNumber;
    private boolean isRinging;

    // create it with intelliJ
    public DeskPhone(int phoneNumber, boolean isRinging) {
        this.phoneNumber = phoneNumber;
        this.isRinging = isRinging;
    }

    // create these implementations with intelliJ
    @Override
    public void powerOn() {
        System.out.println("Power is on now !!!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Ringing the phone number "+phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Aswering...");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==this.phoneNumber){
            this.isRinging=true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
