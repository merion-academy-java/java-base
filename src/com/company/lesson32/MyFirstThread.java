package com.company.lesson32;

public class MyFirstThread extends Thread {

    public static void showThreads() {
        System.out.println("-----------");
        for (int i = 0; i < 10; i++) {
            // NOTE: попробуй запустить программу несколько раз и увидишь,
            // что каждый раз выводятся разные последовательности
            MyFirstThread threadInLoop = new MyFirstThread();
            threadInLoop.start();
        }

        // NOTE: даже вывод в консоль после "Start" происходит не стабильно
        // System.out.println("-----------");
    }

    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
    }
}
