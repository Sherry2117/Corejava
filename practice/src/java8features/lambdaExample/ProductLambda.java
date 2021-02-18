package java8features.lambdaExample;

import java.util.*;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class ProductLambda {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "b", 999f ));
        list.add(new Product(2, "a", 660f ));
        list.add(new Product(3, "c", 50f ));
        System.out.println("Sort based on the name");

        Collections.sort(list,(p1, p2) ->{
            return p1.name.compareTo(p2.name);
        });

       Collections.sort(list, Comparator.comparing(p -> p.name));
        for(Product p : list){
           // System.out.println(p.id+ " " + p.name + " "+ p.price);
        }

        //using lambda to filter data
        Stream<Product> filteredData = list.stream().filter((p -> p.price>100));

        //iterate
        filteredData.forEach(p -> {
            System.out.println(p.name + " "+ p.price);
        });

    }
}
