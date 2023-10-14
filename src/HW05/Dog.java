package HW05;

public class Dog extends Animal{
    private boolean hasFur;

    public Dog() {
    }

    public Dog(String name, int age, double weight, boolean hasFur) {
        super(name, age, weight);
        this.hasFur = hasFur;
    }
    public boolean isHasFur() {
        return hasFur;
    }
    public String toString() {
        return super.toString() + "Dog = " +
                "hasFur: " + hasFur;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Dog))
            return false;
        if (!super.equals(obj))
            return false;

        Dog dog = (Dog) obj;

        return hasFur == dog.hasFur;
    }

}
