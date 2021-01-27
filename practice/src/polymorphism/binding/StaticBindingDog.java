package polymorphism.binding;

import java.util.ArrayList;
import java.util.Date;

public class StaticBindingDog {
    private void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        StaticBindingDog d1 = new StaticBindingDog();
        d1.eat();
        new Date();

    }
}
