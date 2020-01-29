package com.company;

public class AnimalFactory {
    enum AnimalType {
        TIGER, BIRD, DOG
    }

    public Animal getAnimal(AnimalType animalType) {
        switch (animalType) {
            case DOG:
                return new Dog();
            case BIRD:
                return new Bird();
            case TIGER:
                return new Tiger();
            default:
                return null;
        }

    }
}
