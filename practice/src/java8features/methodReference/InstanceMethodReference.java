package java8features.methodReference;

interface Sayable3{
    void say();
}
public class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hello, this is a non-static method... ");
    }

    public static void main(String[] args) {
        //Creating an object
        InstanceMethodReference methodReference = new InstanceMethodReference();
        //refering a non-static method using reference.
        Sayable3 sayable1 = methodReference::saySomething;
        sayable1.say();

        Sayable3 sayable2 = new InstanceMethodReference()::saySomething;
         //anonymous object
        sayable2.say();
    }
}