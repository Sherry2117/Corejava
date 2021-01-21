package polymorphism.finalkeywords;

public class BikeFinalVariable {
     int speedlimit = 90; //final variable

    void run() {
        speedlimit = 400; //this will not print since you used final words in the speed limitvariable
    }

    public static void main(String[] args) {
        BikeFinalVariable bike = new BikeFinalVariable();
        bike.run();
    }
}
