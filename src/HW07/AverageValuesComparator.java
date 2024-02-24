package HW07;

import java.util.Comparator;

public class AverageValuesComparator implements Comparator<MyNumArray> {
    @Override
    public int compare(MyNumArray avg1, MyNumArray avg2) {
        if (avg1.getAverage() < avg2.getAverage()) return -1;
        if (avg1.getAverage() > avg2.getAverage()) return 1;
        return 0;
    }
}
