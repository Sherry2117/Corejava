package polymorphism.superkeywords;

class Bike {
    int speed;

    Bike() {
        System.out.println("Speed is"+speed);
    }
    //Initializer
    //{speed = 100;}
}

public class InstanceInitializer {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
    }
}
