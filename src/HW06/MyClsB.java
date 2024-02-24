package HW06;

public class MyClsB extends MyClsA{
    private int value2;
    public MyClsB(String key, int value1, int value2) {
        super(key, value1);
        this.value2 = value2;
    }
    public int getValue2() {
        return value2;
    }

    public void setValue1(int value) {
        this.value2 = value;
    }
    public boolean equals( Object obj ) {
        if(this == obj)
            return true;
        if(!(obj instanceof MyClsB))
            return false;

        MyClsB b = (MyClsB)obj;

        if(super.equals(obj) && b.value2 == this.value2) // super compares members of parent, and explicity compare memebers of child
            return true;

        return false;
    }
    public String toString() {
        return super.toString() + " Value2: " + value2;
    }
}
