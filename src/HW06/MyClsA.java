package HW06;

public class MyClsA {
    private String key;
    private int value1;

    public MyClsA(String key, int value) {
        this.key = key;
        this.value1 = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value) {
        this.value1 = value;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public boolean equals( Object obj ) {
        if(this == obj)
            return true;
        if(!(obj instanceof MyClsA))
            return false;

        MyClsA a = (MyClsA)obj;

        if(this.key.equals(a.key))
            return true;

        return false;
    }

    public String toString() {
        return "Key: " + key + " Value1: " + value1;

    }
}
