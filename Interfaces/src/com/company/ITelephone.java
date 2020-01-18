package com.company;

public interface ITelephone {

    public void powerOn();
    public void dial(int phoneNumber);
    void answer();                        //Having public or private is unnecessary for Interfaces. You can have them or not.
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
