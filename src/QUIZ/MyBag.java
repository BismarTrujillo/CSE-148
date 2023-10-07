package QUIZ;

public class MyBag {

    private MyCls [] bag;

    public MyBag() {
        bag = new MyCls[16];
    }
    public MyBag(int size) {
        bag = new MyCls[size];
    }
    public boolean addMyCls(MyCls myCls){
        for (int i = 0; i < bag.length; i++) {
            if((bag[i] == null)){ // same obj !=
                bag[i] = myCls;
                return true;
            }
        }
        return false;
    }
    public MyCls findMyCls(MyCls mycls){
        for (int i = 0; i < bag.length; i++) {
            if(bag[i] != null && bag[i].sameObject(mycls)){
                return mycls;
            }
        }
        return null;
    }
    public int findMyClsIndex(MyCls mycls){
        for (int i = 0; i < bag.length; i++) {
            if(bag[i] != null && bag[i].sameObject(mycls)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeMyCls(MyCls mycls){
        int index = findMyClsIndex(mycls);
        if(index < 0)
            return false;
        else{
            bag[index] = null;
            return true;
        }
    }
    public int numberOfMyCls(MyCls [] bag){
        int numberOfMyCls = 0;
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null)
                numberOfMyCls++;
        }
        return numberOfMyCls;
    }

    public MyCls[] smallestAndGreatestValue(MyCls [] bag) {
        MyCls[] smallestAndGreatestValue = new MyCls[2];
        smallestAndGreatestValue[0] = bag[0]; // small
        smallestAndGreatestValue[1] = bag[0]; // big


        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null && bag[i].getValue() < smallestAndGreatestValue[0].getValue())
                smallestAndGreatestValue[0] = bag[i];
            if (bag[i] != null && bag[i].getValue() > smallestAndGreatestValue[1].getValue())
                smallestAndGreatestValue[1] = bag[i];
        }
        return smallestAndGreatestValue;
    }
    public MyCls[] getObjects(int sorted){

        return bag;
    }



}
