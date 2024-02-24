package QUIZ;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        MyBag bag = new MyBag();
        Random rand = new Random();

        bag.addMyCls(new MyCls("Bismar", 2));
        bag.addMyCls(new MyCls("Ed", 6));
        bag.addMyCls(new MyCls("Cit", 7));
        bag.addMyCls(new MyCls("Sai", 1));
        bag.addMyCls(new MyCls("Mat", 2));

    }



}
