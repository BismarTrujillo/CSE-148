package HW04;

import java.util.Arrays;

public class StackOfMyCls {

    private MyCls[] myCls;
    private int size;

    public StackOfMyCls(int capacity) {
        myCls = new MyCls[capacity];
        size = 0;
    }

    public  boolean push(MyCls myClsObj){
        if(size == myCls.length)
            return false;
        size++;
        myCls[size++] = myClsObj;

        return true;
    }

    public MyCls pop(){
        if(isEmpty())
            return null;
        return myCls[--size];
    }

    public MyCls peek(){
        if(isEmpty())
            return null;
        return myCls[size -1];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == myCls.length;
    }

    public String toString() {
        return "StackOfMyCls: " + Arrays.toString(myCls);
    }
}
