package defaultMethodExample;

interface Sayable {
    //Default method
    //complex-trigger-file
    default void say(){
        System.out.println("Hello, this is default method");
        //read the file,
    }
    //abstract method
   abstract void sayMore(String msg);
}

interface Sayable2 {
    //Default method
    default void say1(){
        System.out.println("Hello, this is default method");
    }
    //abstract method
    abstract void sayMore2(String msg);
}

public class DefaultMethods implements Sayable, Sayable2 {
    @Override
    public void sayMore(String msg) { // implementing abstract method
        System.out.println(msg);
    }


    @Override
    public void sayMore2(String msg) {

    }

    public static void main(String[] args) {
        DefaultMethods dms = new DefaultMethods();
        dms.say();
        dms.sayMore("Word is workship"); //calling abstract method
    }


}
