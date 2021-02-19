package java8features.methodReference;

public class InstanceMethodRef2 {

    public void printMsg(){
        System.out.println("Hello, this is Instance method message");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new InstanceMethodRef2()::printMsg);
        t2.start();
    }
}
