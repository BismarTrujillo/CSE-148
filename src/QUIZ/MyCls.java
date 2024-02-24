package QUIZ;

public class MyCls {
    private String name;
    private int value;

    public MyCls() {
        name = "anonymous";
        value = 0;
    }
    public MyCls(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public boolean sameObject(MyCls obj){
        return (this.name.equals(obj.name)) && (this.value == obj.value);
    }

    public String toString() {
        return "MyCls{" +
                "name: '" + name  + ", value: " + value;
    }
}
