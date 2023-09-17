package HW02;

import java.util.*;

public class TestRing {
    public static void main(String[] args) {
        Random rand = new Random();
        Ring[] ringArray = new Ring[5];
        Ring[] newRingArray = new Ring[3];


        ringArray[0] = new Ring(3.1,2.1);
        ringArray[1] = new Ring(4.2,1.2);
        ringArray[2] = new Ring(8.4,4.2);
        ringArray[3] = new Ring(9.1,4.5);
        ringArray[4] = new Ring(3.5,1.2);

        int index1 = rand.nextInt(ringArray.length);
        int index2;

        do {
            index2 = rand.nextInt(ringArray.length);
        } while (index2 == index1);

        int newRingArrayIndex = 0;
        for (int i = 0; i < ringArray.length; i++) {
            if (i != index1 && i != index2) {
                newRingArray[newRingArrayIndex] = ringArray[i];
                newRingArrayIndex++;
            }
        }

        double smallestRingArea = Ring.smallestLargestRing(ringArray).smallest.getArea();
        double largestRingArea = Ring.smallestLargestRing(ringArray).largest.getArea();

        System.out.println("The average area of rings is: " + averageAreaOfRings(ringArray));
        System.out.println("The largest ring has area: " + largestRingArea + " the smallest ring has area: " + smallestRingArea);
    }
    public static double averageAreaOfRings(Ring[] ringsArray) {
        double areaSum = 0.0;
        for (Ring ring : ringsArray) {
            areaSum += ring.getArea();
        }
        return areaSum / ringsArray.length;
    }

}

