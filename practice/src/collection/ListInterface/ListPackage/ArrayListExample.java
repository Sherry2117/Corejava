package collection.ListInterface.ListPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Creating ArrayList;

        list.add("Muneeb");
        list.add("Vijay");
        list.add("abc");
        list.add("yyy");
        for(int i = 0; i<50; i++){
            list.add("i - "+i);
        }
        //traveling list
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
