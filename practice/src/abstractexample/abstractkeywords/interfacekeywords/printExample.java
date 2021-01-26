package abstractexample.abstractkeywords.interfacekeywords;


interface printable {
    void print();
}

public class printExample implements printable {
    @Override
    public void print() {
       System.out.println("Hello print");
    }

    public static void main(String[] args) {
        printExample printExample = new printExample();
        printExample.print();
    }
}
