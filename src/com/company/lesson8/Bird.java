package com.company.lesson8;

public class Bird  extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        this.canFly = true;
    }

    public void takeOff() {
        flyModeActive = true;
    }

    public void landing(){
        flyModeActive = false;
    }

    public void isTheBirdFlying(){
        System.out.println(
                this.flyModeActive == true ? "Duck: flying mode - yes" : "Duck: flying mode - no"
        );
    }
}