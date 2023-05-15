package com.company.lesson8;

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
}
