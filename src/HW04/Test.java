package HW04;

public class Test {

    public static void main(String[] args) {
        StackOfMyCls stackMyCls = new StackOfMyCls(6);

        stackMyCls.push(new MyCls("key1", 1));
        stackMyCls.push(new MyCls("key2", 2));
        stackMyCls.push(new MyCls("key3", 3));
        stackMyCls.push(new MyCls("key4", 4));
        stackMyCls.push(new MyCls("key5", 5));
        stackMyCls.push(new MyCls("key6", 6));

        System.out.println(stackMyCls.toString());

        System.out.println("Peeking: " + stackMyCls.peek());
        System.out.println("Popping: " + stackMyCls.pop());
        System.out.println("Popping: " + stackMyCls.pop());
        System.out.println("Peeking " + stackMyCls.peek());



    }
}
