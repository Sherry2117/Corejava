package polymorphism.superkeywords;

public class Bike2 {
    int speed;

    Bike2(){
        System.out.println("Constructor is invoked");
    }
    {
        System.out.println("instance initializer block invoked");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Bike2();

    }
}
