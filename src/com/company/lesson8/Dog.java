package com.company.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
    }

    /**
     * Идем до позиции палки. Что бы дойти до палки, нужно определить разницу между текущей позицией и позицией палки
     *
     * @param stickPosition - позиция палки
     */
    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog() {
        System.out.println("Current position: " + this.currentPosition);
    }

    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(AnimalWeight weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("wow!");
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();

        try {
            dogs.add(Dog.of("Sharik", new AnimalWeight(-3, AnimalWeight.WeightType.KG)));
            dogs.add(Dog.of("Bubble", new AnimalWeight(1, AnimalWeight.WeightType.KG)));
            dogs.add(Dog.of("Tuzic", new AnimalWeight(5, AnimalWeight.WeightType.KG)));
        } catch (WeightException e) {
            e.printStackTrace();
        }

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
