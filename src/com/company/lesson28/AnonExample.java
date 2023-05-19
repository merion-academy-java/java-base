package com.company.lesson28;

import com.company.lesson8.Flight;

public class AnonExample {
    public static void run() {
        Flight flight = new Flight() {
            @Override
            public void takeOff() {
                System.out.println("Flight.takeOff");
            }

            @Override
            public void landing() {
                System.out.println("Flight.landing");
            }
        };

        flight.takeOff();
        flight.landing();
    }
}
