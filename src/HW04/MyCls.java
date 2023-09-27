package HW04;

public class MyCls {
    String key;
    int value;

    public MyCls(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public boolean compareMyCls(MyCls myCls1, MyCls myCls2){
        return myCls1.key.equals(myCls2.key) && (myCls1.value == myCls2.value);
    }

    public String toString() {
        return "MyCls{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
