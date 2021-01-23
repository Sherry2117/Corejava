package exampleinstanceof;

public class Dog {

    public static void main(String[] args) {
        Dog d = new Dog();
        Object obj = new Object();
        String str = new String("Test");
        checkInstance(obj);
        checkInstance(d);
        checkInstance(str);
    }

    public static void checkInstance(Object obj) {
        System.out.println(obj instanceof Dog); //false since d = null
        if (obj instanceof Dog){
            System.out.println();
            //if the object is of type Dog then only I will print/perform operation
        }
    }
}
