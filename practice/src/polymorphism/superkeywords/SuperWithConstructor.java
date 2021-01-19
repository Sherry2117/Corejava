package polymorphism.superkeywords;

class Animal3 {
    Animal3() {
        System.out.println("Animal is created");
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        System.out.println("Dog is created");
    }
}
public class SuperWithConstructor {
    public static void main(String[] args) {
        Dog3 dog3 = new Dog3();

    }
}
