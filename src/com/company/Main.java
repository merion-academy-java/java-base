package com.company;

import com.company.lesson16.SwitchExample;
import com.company.lesson5.POJO;
import com.company.lesson6.Animal;
import com.company.lesson6.Cat;
import com.company.lesson8.Dog;
import com.company.lesson8.Duck;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

        // Lesson #8 - Методы
        com.company.lesson8.Cat catFromLesson8 = new com.company.lesson8.Cat("Barsik", 20);
        System.out.println(catFromLesson8.jumpHeight());

        // Lesson #9 - Уровни методов в java
        Dog dog = new Dog();

        dog.goToStick(14);
        dog.whereTheDog();

        dog.goToStick(20);
        dog.whereTheDog();

        dog.goToStick(5);
        dog.whereTheDog();
        dog.voice();

        // Lesson #10 - Наследование
        Dog homelessDog = Dog.ofHomeless(100);
        homelessDog.voice();

        Duck duck = new Duck();
        duck.voice();

        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();

        // Lesson #11 - Аннотации. Популярные аннотации @Override
        catFromLesson8.voice();


        // Lesson #13 - Массивы
        List<Dog> dogsHomless = Arrays.asList(new Dog[]{
                Dog.ofHomeless(2),
                Dog.ofHomeless(3),
                Dog.ofHomeless(5)
        });
        for(Dog dogItem : dogsHomless){
            System.out.println(dogItem);
        }

        System.out.println("   ");
        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }

        // Lesson #15 - Циклы
        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));

        System.out.println("   ");
        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()){
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

        // Lesson #16 - Switch
        System.out.println("   ");
        for(int i = 0; i < 100; i++){
            SwitchExample.run();
        }
    }
}
