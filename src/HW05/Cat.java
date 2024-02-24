package HW05;

public class Cat extends  Animal {
    private int coat;

    public Cat() {

    }
    public Cat(String name, int age, double weight, int coat) {
        super(name, age, weight);
        this.coat = coat;
    }

    public int getCoat() {
        return coat;
    }
    public String toString() {
        return super.toString() + "Cat =" +
                "coat: " + coat;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Cat))
            return false;
        if (!super.equals(obj))
            return false;

        Cat cat = (Cat) obj;

        return coat == cat.coat;
    }

}
