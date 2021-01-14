package thisusage.current_class;

public class A {
    void n(){
        System.out.println("Hello n");

    };
    void m(){
        System.out.println("Hello m");
        n();
    }

    public static void main(String[] args) {
        A a = new A();
        a.m();

    }
}

