package com.company.lesson8;

public class Duck extends Bird {
    public Duck() {
    }

    @Override
    public void voice() {
        System.out.println("quack");
    }

    public void showSpeed() {
        if (this.flyModeActive == true) {
            System.out.println("Duck speed: 40");
        } else {
            System.out.println("Duck speed: 4");
        }
    }
}