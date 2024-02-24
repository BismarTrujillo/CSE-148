package HW10;

public class ClsA {

    private String key;

    public ClsA(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ClsA))
            return false;
        ClsA clsA = (ClsA)obj;

        return this.key.equals(clsA.getKey());
    }

}
