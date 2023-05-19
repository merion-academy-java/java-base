package com.company.lesson8;

public abstract class Bird extends Animal implements Flight {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

//    // NOTE: запрещаем переопределение этого метода в дочерних классах
//    public final void takeOff() {
//        flyModeActive = true;
//    }
//
//    // NOTE: запрещаем переопределение этого метода в дочерних классах
//    public final void landing(){
//        flyModeActive = false;
//    }


    @Override
    public void takeOff() {
        flyModeActive = true;
    }

    @Override
    public void landing() {
        flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(
                this.flyModeActive == true ? "Duck: flying mode - yes" : "Duck: flying mode - no"
        );
    }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}