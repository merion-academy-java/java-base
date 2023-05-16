package com.company.lesson8;

public class Duck extends Bird {

    public static final String DUCK_VOICE = "quack";
    public static final Integer SPEED_FLY = 40;
    public static final Integer SPEED_WALK = 4;

    public Duck() {
        super();
    }

    @Override
    public void voice() {
        System.out.println(DUCK_VOICE);
    }

    public void showSpeed() {
        if (this.flyModeActive == true) {
            System.out.println("Duck speed: " + SPEED_FLY);
        } else {
            System.out.println("Duck speed: " + SPEED_WALK);
        }
    }
}