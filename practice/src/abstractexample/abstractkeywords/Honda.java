package abstractexample.abstractkeywords;

abstract class Bike {
    abstract void run();
}
public class Honda extends Bike {

    void run(){
        System.out.println("Honda bike running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}

