package garbagecollection;

public class Addition {
    public int balance = 100;
    synchronized void add(int n) {
        this.balance = this.balance + n;
        System.out.println("My Balance is now :-" + this.balance);
    }
}

class MyThread3 extends Thread{
    Addition t;
    MyThread3(Addition t) {
        this.t =t;
    }

    @Override
    public void run() {
        t.add(5);
    }
}

class MyThread4 extends Thread{
    Addition t;
    MyThread4(Addition t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.add(100);
    }
}

class AddProblem {
    public static void main(String[] args) {
        Addition obj = new Addition();
        MyThread3 t1 = new MyThread3(obj);
        MyThread4 t2 = new MyThread4(obj);
        t1.start();
        t2.start();
    }

}
