package collection.ListInterface.SetPackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");
        set.add("null");
        set.add("null");


       /* Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        for(String temp : set){
            System.out.println(temp);
        }
        set.forEach(t->{
            System.out.println(t);
        });

        if(set.contains("a")){
            System.out.println("A value already exists");
        }
    }
}
