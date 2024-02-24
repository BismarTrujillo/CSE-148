package HW05;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal() {

    }
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString() {
        return "Animal = " +
                "name: '" + name  +
                ", age: " + age +
                ", weight: " + weight;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;
        Animal animal = (Animal) obj;

        if(this.age == animal.age && this.name.equals(animal.name) && this.weight == animal.weight){
            return true;
        }
    return false;
    }

}
