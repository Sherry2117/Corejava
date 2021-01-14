package constructor;

public class A {
    A(){
        System.out.println("hello a");
    }
    A(int x) {
        this();
        System.out.println("hello x : ->" +x);
    }

    public static void main(String[] args) {
        new A( 45);
    }
}
