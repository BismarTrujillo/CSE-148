package HW07;

import java.util.ArrayList;
import java.util.Collections;

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
            System.out.println("List: ");
            for (int num: arr.data) {
                System.out.println(num);
            }
        }

        Collections.sort(myArrayNumList);


        for (MyNumArray arr: myArrayNumList) {
            System.out.println("List: ");
            for (int num: arr.data) {
                System.out.println(num);
            }
        }
    }


}
