package polymorphism.finalkeywords;

class Bike2 {

//add final in void run (final keyword method//
    void run() {
        System.out.println("Running");
    }

}


public class Honda extends Bike2 {

    void run(){
        System.out.println("running safely 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
