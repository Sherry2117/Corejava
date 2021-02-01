package Misc;

public class CallByValue2 {
    int data = 50;

    void change(CallByValue2 obj) {
        this.data = data+100; //changes will be in the local variable only
    }

    public static void main(String[] args) {
        CallByValue2 op = new CallByValue2();
        System.out.println("Before change" + op.data);
        op.change(op);
        System.out.println("After change"+op.data);
    }
}

