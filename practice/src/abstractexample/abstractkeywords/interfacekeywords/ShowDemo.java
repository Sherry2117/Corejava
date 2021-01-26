package abstractexample.abstractkeywords.interfacekeywords;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class ShowDemo implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Print my page PDF, Hello");

    }

    @Override
    public void show() {
        System.out.println("Showing my page PDF, Hello");
    }

    public static void main(String[] args) {
        ShowDemo showDemo = new ShowDemo();
        showDemo.print();
        showDemo.show();
    }
}