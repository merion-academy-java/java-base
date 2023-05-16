package com.company.lesson16;

import java.util.Random;

public class SwitchExample {
    public static void run() {
        Random random = new Random();
        int example = random.nextInt(5);

        // "if" example
//        if (example == 0) {
//            System.out.println("This is zero");
//        } else if (example == 1) {
//            System.out.println("This is one");
//        } else if (example == 2) {
//            System.out.println("This is two");
//        } else if (example == 3) {
//            System.out.println("This is three");
//        } else {
//            System.out.println("Other digit");
//        }

        // Switch example
        switch (example){
            case 0:
                System.out.println("This is zero");
                break;
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is two");
                break;
            case 3:
                System.out.println("This is three");
                break;
            default:
                System.out.println("Other digit");
                break;
        }
    }
}
