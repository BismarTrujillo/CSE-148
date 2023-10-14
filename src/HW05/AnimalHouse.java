package HW05;

public class AnimalHouse {
    private Animal[] house;

    public AnimalHouse() {
        this.house = new Animal[32];
    }
    public AnimalHouse(int size ) {
       this.house = new Animal[size];
    }

    public boolean addAnimal(Animal animal){
        for (int i = 0; i < house.length; i++) {
            if(house[i] == null){
                house[i] = animal;
                return true;
            }
        }
        return false;
    }
    public boolean removeAnimal(String name){
        for (int i = 0; i < house.length; i++) {
            if(house[i] != null && name.equals(house[i].getName()))
                house[i] = null;
            return true;
        }
        return false;
    }
    public boolean removeAnimal(int index){
        for (int i = 0; i < house.length; i++) {
            if(house[i] != null)
                house[index] = null;
            return true;
        }
        return false;
    }
    public boolean findAnimal(String name){
        for (int i = 0; i < house.length; i++) {
            if(house[i] != null && name.equals(house[i].getName()))
                return true;
        }
        return false;
    }
    public int getNumberOfAnimals(int species){
        int cats = 0;
        int dogs = 0;
        int allAnimals = 0;

        for (int i = 0; i < house.length; i++) {
            if(house[i] == null)
                continue;
             if(house[i] instanceof Cat){
                 cats++;
                 allAnimals++;
             } else if (house[i] instanceof Dog) {
                 dogs++;
                 allAnimals++;
             }
        }
        if (species == 1){
            return cats;
        }else if(species == 2){
            return dogs;
        }else
            return allAnimals;
    }
    public double getAverageWeight(int species){
        double catsWeight = 0.0;
        double dogsWeight = 0.0;
        double allAnimalsWeight = 0.0;

        for (int i = 0; i < house.length; i++) {
            if (house[i] != null) {

                if (house[i] instanceof Cat) {
                    catsWeight += house[i].getWeight();
                } else if (house[i] instanceof Dog) {
                    dogsWeight += house[i].getWeight();
                } else
                    allAnimalsWeight += house[i].getWeight();
            }
        }

        if (species == 1){
            return catsWeight / getNumberOfAnimals(1);
        }else if(species == 2){
            return dogsWeight / getNumberOfAnimals(2);
        }else
            return allAnimalsWeight / getNumberOfAnimals(3);
    }
    public Animal getAnimalWithHeaviestWeight(int species){
        Animal heaviestAnimal = new Animal("temp",0,0.0);

        for (int i = 0; i < house.length; i++) {
            if (house[i] != null) {

                if ( species == 1){
                        if(house[i] instanceof Cat && (house[i].getWeight() > heaviestAnimal.getWeight())){
                            heaviestAnimal = house[i];
                        }
                } else if ( species == 2){
                        if(house[i] instanceof Dog && (house[i].getWeight() > heaviestAnimal.getWeight())){
                            heaviestAnimal = house[i];
                        }
                }else if (house[i].getWeight() > heaviestAnimal.getWeight())
                    heaviestAnimal = house[i];
            }
        }
        return heaviestAnimal;
    }
    public boolean isEmpty(){
        for (int i = 0; i < house.length; i++) {
            if(house[i] != null)
                return false;
        }
        return true;
    }
    public String toString() {
        return "Number of Animals = "+ getNumberOfAnimals(3)  +
                " Cats: " + getNumberOfAnimals(1) +
                " Dogs: " + getNumberOfAnimals(2);
    }
}
