import java.util.*;

public class Test {
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
        System.out.println("\nUpdated array:");
        for (Ring value : newRingArray) {
            System.out.println(value);

        }
        System.out.println("The average area of rings is: " + Ring.averageAreaOfRings(ringArray));

        System.out.println("The largest ring has area: " + Ring.smallestLargestRing(ringArray).largest.getArea() + "the smallest ring has area: " + Ring.smallestLargestRing(ringArray).smallest.getArea());
    }

}
