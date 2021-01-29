package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestArray {

    public static void main(String[] args) {
        int a[] = new int[5];

        a[0] = 10; //initial 10
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        List<Integer> z = new ArrayList<>();
        z.add(1);
        z.add(2);

        for(int i = 0; i < a.length; i++) { //length is the property of array
            System.out.println(a[i]);
            z.add(i);
            z.add(a[i]);
        }
        System.out.println("======= My dynamic array ======");
        for(Integer i :z){
            System.out.println(i);

        }

    }
}
