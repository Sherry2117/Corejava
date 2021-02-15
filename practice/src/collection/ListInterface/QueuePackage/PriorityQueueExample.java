package collection.ListInterface.QueuePackage;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Neha");
        queue.add("Sherry");
        queue.add("Wahaj");
        queue.add("test");

        System.out.println("head:"+ queue.element());
        System.out.println("peek:"+ queue.peek());
        System.out.println("Iterate:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();

        System.out.println("After Remove:");
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }



    }
}
