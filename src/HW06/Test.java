package HW06;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyClsA[] array = new MyClsA[9];
        array[0] = new MyClsA("keyA1", 50);
        array[1] = new MyClsB("keyB4", 10, 100);
        array[2] = new MyClsB("keyB2", 40, 120);
        array[3] = new MyClsA("keyA3", 30);
        array[4] = null;
        array[5] = new MyClsA("keyA2", 10);
        array[6] = new MyClsB("keyB6", 20, 150);
        array[7] = null;
        array[8] = new MyClsB("keyB4", 20, 210);



        System.out.println("test_01_GetObjects "+Arrays.toString(test_01_GetObjects(array, 1)));
        System.out.println("test_02_GetAverageValue "+test_02_GetAverageValue(array, 2));
        System.out.println("test_03_SortObject "+ Arrays.toString(test_03_SortObject(array)));
    }

    public static MyClsA[] test_01_GetObjects(MyClsA[] array, int type) {

        int countA = 0;
        int countB = 0;
        int index = 0;
        MyClsA[] returnArray;

        for (MyClsA a : array) {
            if(a != null) {
                if (!(a instanceof MyClsB)) {
                    countA++;
                } else {
                    countB++;
                }
            }
        }

            if (type == 1) {
                returnArray = new MyClsA[countA];
                for (MyClsA a : array) {
                    if (!(a instanceof MyClsB) && a != null)
                        returnArray[index++] = a;
                }
                return returnArray;

            } else if (type == 2) {
                returnArray = new MyClsA[countB];
                for (MyClsA a : array) {
                    if (a instanceof MyClsB)
                        returnArray[index++] = a;
                }
                return returnArray;

            } else {
                returnArray = new MyClsA[countB + countA];
                for (MyClsA a : array) {
                    if (a != null)
                        returnArray[index++] = a;
                }
                return returnArray;
            }
    }
    public static double test_02_GetAverageValue(MyClsA [] array, int type) {
        double avgValue1A = 0.0;
        double avgValue2B = 0.0;
        double avgValue1AB = 0.0;
        int numberOfObjs = 0;

        for (MyClsA a :array) {
            if(a != null){

                    if(!(a instanceof MyClsB)){
                        avgValue1AB += a.getValue1();
                        avgValue1AB+= a.getValue1();
                        numberOfObjs++;
                    } else {
                        avgValue2B += ((MyClsB) a).getValue2();
                        avgValue1AB += a.getValue1();
                        numberOfObjs++;
                    }
            }
        }
        if (type == 1){
            return avgValue1A / numberOfObjs;
        } else if (type == 2) {
            return avgValue2B / numberOfObjs;
        }else
            return avgValue1AB /numberOfObjs;
    }
    public static MyClsA[] test_03_SortObject(MyClsA [] array) {

        int count = 0;
        for(MyClsA a : array) {
            if(a != null)
                count++;
        }
        int idx = 0;
        MyClsA [] list = new MyClsA[count];

        for(MyClsA a : array) {
            if(a != null) {
                list[idx++] = a;
            }
        }
        for(int i = 0; i<list.length; i++) {
            for(int j = i+1; j<list.length; j++) {
                if(list[i].getValue1() > list[j].getValue1() ) {
                        MyClsA temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                }
            }
        }
        return list;
    }









}
