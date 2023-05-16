package com.company.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    /**
     * Идем до позиции палки. Что бы дойти до палки, нужно определить разницу между текущей позицией и позицией палки
     * @param stickPosition - позиция палки
     */
    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog(){
        System.out.println("Current position: " + this.currentPosition);
    }

    public static Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice(){
        System.out.println("wow!");
    }

    public static List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharik", 3));
        dogs.add(Dog.of("Bubble", 1));
        dogs.add(Dog.of("Tuzic", 5));

        return dogs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
