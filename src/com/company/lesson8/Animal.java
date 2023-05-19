package com.company.lesson8;

import java.util.Objects;

abstract class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected MoveType moveType;

    public Animal(String name, Integer weight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public abstract void voice();

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

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(weight, animal.weight) && Objects.equals(currentPosition, animal.currentPosition) && moveType.equals(animal.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, currentPosition, moveType);
    }
}
