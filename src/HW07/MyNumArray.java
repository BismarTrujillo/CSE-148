package HW07;

import java.util.Random;

public class MyNumArray implements  MaxMinNum, Comparable<MyNumArray>, Cloneable{

    int[] data;

    public MyNumArray() {
        Random rd = new Random();
        this.data = new int[16];
        for (int i = 0; i < data.length; i++) {
            data[i] = rd.nextInt();
        }
    }

    public MyNumArray(int size) {
        Random rd = new Random();
        this.data = new int[size];
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = rd.nextInt();
        }
    }

    public int getNumber(int index){
        return this.data[index];
    }

    public void setNumber(int value, int index){
        this.data[index] = value;
    }

    public double getAverage(){
        double sum = 0;
        for(int arr: this.data){
            sum += arr;
        }
        return sum / this.data.length;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(!(obj instanceof MyNumArray))
            return false;

        MyNumArray num = (MyNumArray)obj;

        if(this.data.length == num.data.length){
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i] != num.data[i])
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyNumArray: " +
                "Data size = " + data.length +
                "Minimum = " + getMinimum() +
                "Maximum = " + getMaximun();
    }

    @Override
    public int getMaximun() {
        int max = this.data[0];

        for (int num : this.data) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int getMinimum() {
        int min = this.data[0];

        for (int num : this.data) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public MyNumArray clone() {
        try {
            MyNumArray clone = (MyNumArray) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    @Override
    public int compareTo(MyNumArray numArray) {

        if(this.getMaximun() == numArray.getMaximun()){
            if (this.getMinimum() == numArray.getMinimum())
                return 0;
        } else if (this.getMaximun() > numArray.getMaximun())
            return 1;
        return -1;
    }
}
