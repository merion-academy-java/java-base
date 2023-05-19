package com.company;

import com.company.lesson16.SwitchExample;
import com.company.lesson23.StringExample;
import com.company.lesson24.TypeConversion;
import com.company.lesson5.POJO;
import com.company.lesson8.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Lesson #5 - POJO
        POJO.run();

        // Lesson #6 - Экземпляры класса
        com.company.lesson6.Animal animal = new com.company.lesson6.Animal();
        animal.voice();

        com.company.lesson6.Cat cat = new com.company.lesson6.Cat();
        cat.voice();

        // Lesson #7 - Пакеты Java
        com.company.lesson7.Cat catFromLesson7 = new com.company.lesson7.Cat();
        catFromLesson7.voice();

        // Lesson #8 - Методы
        Cat catFromLesson8 = new Cat("Barsik", new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG));
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
        Dog homelessDog = Dog.ofHomeless(new Animal.AnimalWeight(9, Animal.AnimalWeight.WeightType.KG));
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
        List<Dog> dogsHomeless = Arrays.asList(new Dog[]{
                Dog.ofHomeless(new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(4, Animal.AnimalWeight.WeightType.KG))
        });

        for (Dog dogItem : dogsHomeless) {
            System.out.println(dogItem);

            // Lesson #19 - Getters & Setters
            dogItem.setName(String.valueOf((new Random()).nextInt(10)));
            System.out.println("Dog homeless number: " + dogItem.getName());

            // Lesson #20 - equals и hashcode методы
            System.out.println("Dog homeless hash code: " + dogItem.hashCode());
        }

        System.out.println("   ");
        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }

        // Lesson #15 - Циклы
        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG)));

        System.out.println("   ");
        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()) {
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

        // Lesson #16 - Switch
        System.out.println("   ");
        for (int i = 0; i < 100; i++) {
            // SwitchExample.run();
        }

        // Lesson #17 - Уровни доступа
        // Animal animalPrivateExample = new Animal();

        // Lesson #20 - equals и hashcode методы
        Dog dogSharik = new Dog("Sharik", new Animal.AnimalWeight(4, Animal.AnimalWeight.WeightType.KG));
        Dog dogBobik = new Dog("Bobik", new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG));
        Dog dogsharikVar1 = new Dog("Sharik", new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG));

        System.out.println("Operation '==' return: " + (dogSharik == dogSharik));
        System.out.println("Operation '==' return: " + (dogSharik == dogBobik));
        System.out.println("Operation '==' return: " + (dogSharik == dogsharikVar1));

        System.out.println(" ");

        System.out.println("Operation 'equals' return: " + dogSharik.equals(dogSharik));
        System.out.println("Operation 'equals' return: " + dogSharik.equals(dogBobik));
        System.out.println("Operation 'equals' return: " + dogSharik.equals(dogsharikVar1));


        // Lesson #22 - Enum. Перечисления
        System.out.println(" ");
        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if (dog.getMoveType() == MoveType.WALK) {
            System.out.println("Может ходить");
        }

        // Lesson #23 - String
        System.out.println(" ");
        StringExample.run();

        // Lesson #24 - Приведение типов
        TypeConversion.run();

        // Lesson #26 - абстрактные классы
        // NOTE: нельзя создать абстрактный класс
        // Bird bird = new Bird();
    }
}
