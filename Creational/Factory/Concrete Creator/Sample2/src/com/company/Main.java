package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory(); //can be improved
        Animal animal = animalFactory.getAnimal(AnimalFactory.AnimalType.DOG);
        animal.talk();
        animal = animalFactory.getAnimal(AnimalFactory.AnimalType.TIGER);
        animal.talk();
        animal = animalFactory.getAnimal(AnimalFactory.AnimalType.BIRD);
        animal.talk();
    }
}
