package HW05;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        AnimalHouse house = new AnimalHouse();
        Random rand = new Random();

        house.addAnimal(new Dog("dog1", 2, 3.5, true));
        house.addAnimal(new Dog("dog2", 1, 5.5, false));
        house.addAnimal(new Dog("dog3", 7, 10.5, true));
        house.addAnimal(new Dog("dog4", 9, 11.5, false));
        house.addAnimal(new Cat("cat1", 2, 4.5, 0));
        house.addAnimal(new Cat("cat2", 7, 1.5, 2));
        house.addAnimal(new Cat("cat3", 1, 3.5, 1));
        house.addAnimal(new Dog("dog5", 10, 1.5, false));
        house.addAnimal(new Cat("cat4", 1, 8.5, 0));


        int randomAnimal = rand.nextInt(house.getNumberOfAnimals(3));
        house.removeAnimal(randomAnimal);
        int randomAnimal2 = rand.nextInt(house.getNumberOfAnimals(3));
        house.removeAnimal(randomAnimal2);
        int randomAnimal3 = rand.nextInt(house.getNumberOfAnimals(3));
        house.removeAnimal(randomAnimal3);

        System.out.println(house.toString());
        System.out.println("Heaviest dog: " + house.getAnimalWithHeaviestWeight(2));
        System.out.println("Heaviest cat: " + house.getAnimalWithHeaviestWeight(1));

    }
}
