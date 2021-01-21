package polymorphism.finalkeywords;

class Vehicle{
    final void run() {
        System.out.println("running");
    }
}

public class Bike4 extends Vehicle {

   // void run(){

    }

    public static void main(String[] args) {
        new Bike4().run();
    }
}
