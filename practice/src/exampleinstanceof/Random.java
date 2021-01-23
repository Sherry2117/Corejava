package exampleinstanceof;

interface Printable {}
class A implements Printable{
    public void a() {
        System.out.println("A method");
    }
}
class B implements Printable{
    public void b() {
        System.out.println("B method");
    }
}
class Call {
    void invoke(Printable p) {  //upcasting
        if (p instanceof A) {
            A a = (A) p; //Downcasting
            a.a();
        }
        if (p instanceof B) {  //Downcasting
            B b = (B) p;
            b.b();
        }
    }
}



public class Random {

    public static void main(String[] args) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}
