package HW07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        ArrayList<MyNumArray> myArrayNumList = new ArrayList<>();

        MyNumArray numArray1 = new MyNumArray();
        MyNumArray numArray2 = new MyNumArray();
        MyNumArray numArray3 = new MyNumArray();

        myArrayNumList.add(numArray1);
        myArrayNumList.add(numArray2);
        myArrayNumList.add(numArray3);

        for (MyNumArray arr: myArrayNumList) {
            System.out.println(arr);
        }
        Collections.sort(myArrayNumList, new AverageValuesComparator());

        Collections.sort(myArrayNumList, new Comparator<MyNumArray>() {
            @Override
            public int compare(MyNumArray max1, MyNumArray max2) {
                return max1.getMaximum() - max2.getMaximum();
            }
        });

        Collections.sort(myArrayNumList, (min1, min2) -> min1.getMinimum() - min2.getMinimum());

        for (MyNumArray arr: myArrayNumList) {
            System.out.println(arr);
        }

    }


}
