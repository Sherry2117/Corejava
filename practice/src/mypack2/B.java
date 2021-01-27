package mypack2;

import mypack1.A;
import mypack1.Simple;

public class B {

    public void msg() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A a = new A();
        Simple simple = new Simple();
        a.msg();
    }
}
