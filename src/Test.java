import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        Ring [] ringArray = new Ring[5];


        ringArray[0] = new Ring();
        ringArray[1] = new Ring();
        ringArray[2] = new Ring();
        ringArray[3] = new Ring();
        ringArray[4] = new Ring();

        List<Ring> ringList= new ArrayList<>(Arrays.asList(ringArray));

        List<Ring> deletedRings;
        deletedRings = Collections.shuffle(ringList);

        ringList.remove(0);
        ringList.remove(0);


       Ring [] newRingArray = ringList.toArray(ringArray);

        System.out.println(newRingArray.length);




    }


}
