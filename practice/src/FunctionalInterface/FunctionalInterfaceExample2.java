package FunctionalInterface;


interface Doable2{
    default void doIt(){
        System.out.println("Do it now..");
    }
}
@FunctionalInterface
interface Sayable2 extends Doable2{
     void say(String msg); //abstract method
}
public class FunctionalInterfaceExample2 implements Sayable2{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample2 obj = new FunctionalInterfaceExample2();
        obj.say("Hello World..");
        obj.doIt();
    }
}
