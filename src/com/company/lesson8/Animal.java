package com.company.lesson8;

import java.util.Objects;

class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected Boolean canFly = false;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        this.canFly = false;
    }

    public Animal() {
        this.canFly = false;
    }

    public void voice(){
        System.out.println("Voice!");
    }

    protected void runForward(Integer length){
        this.currentPosition += length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(weight, animal.weight) && Objects.equals(currentPosition, animal.currentPosition) && canFly.equals(animal.canFly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, currentPosition, canFly);
    }
}
