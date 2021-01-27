package accessmodifiers.privatepkg;


//Private access modifier
class A {
    private int date = 40;

    private void msg() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        /*A a = new A();
        System.out.println("A date==>" + a.date);
        a.msg();*/
    }
}
public class Simple {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("A date==>" + a.date);
        a.msg();
    }
}