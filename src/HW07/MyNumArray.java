package HW07;

import java.util.Random;

public class MyNumArray implements  MaxMinNum, Comparable<MyNumArray>, Cloneable{

    int[] data;

    public MyNumArray() {
        Random rd = new Random();
        this.data = new int[16];
        for (int i = 0; i < data.length; i++) {
            data[i] = rd.nextInt(100);
        }
    }

    public MyNumArray(int size) {
        Random rd = new Random();
        this.data = new int[size];
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = rd.nextInt(100);
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

    public String toString() {
        return "MyNumArray: " +
                "Data size = " + data.length +
                " \n Minimum = " + getMinimum() +
                " \n Maximum = " + getMaximum() +
                " \n Average = " + getAverage();
    }

    public int getMaximum() {
        int max = this.data[0];

        for (int num : this.data) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public int getMinimum() {
        int min = this.data[0];

        for (int num : this.data) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    protected Object clone() {
        MyNumArray numArray = null;
        try{
            numArray = (MyNumArray) super.clone();
            numArray.data = new int[this.data.length];
            for (int i = 0; i < numArray.data.length; i++) {
                if(this.data[i] != 0)
                numArray.data[i] = this.data[i];
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return numArray;
    }

    public int compareTo(MyNumArray numArray) {

        if(getMaximum() == numArray.getMaximum()){
            if (getMinimum() == numArray.getMinimum())
                return 0;
        } else if (getMaximum() > numArray.getMaximum())
            return 1;
        return -1;
    }
}
