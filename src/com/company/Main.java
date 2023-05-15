package com.company;

import com.company.lesson5.POJO;
import com.company.lesson6.Animal;
import com.company.lesson6.Cat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Lesson #5 - POJO
        POJO.run();

        // Lesson #6 - Экземпляры класса
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        // Lesson #7 - Пакеты Java
        com.company.lesson7.Cat catFromLesson7 = new com.company.lesson7.Cat();
        catFromLesson7.voice();
    }
}
