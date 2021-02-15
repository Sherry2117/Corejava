package collection.ListInterface.QueuePackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ArrayDequeExample {

    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.add("Neha");
        queue.add("Sherry");
        queue.add("Wahaj");
        queue.add("test");
        for (String str :queue){
            System.out.println(str);
        }
    }
}
