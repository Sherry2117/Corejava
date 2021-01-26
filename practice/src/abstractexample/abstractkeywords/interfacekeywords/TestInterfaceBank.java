package abstractexample.abstractkeywords.interfacekeywords;

interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {

    @Override
    public float rateOfInterest() {
        return 10.5f;
    }
}
class ICICI implements Bank {

    @Override
    public float rateOfInterest() {
        return 9.5f;
    }
}
public class TestInterfaceBank {


    public static void main(String[] args) {
        Bank b = new ICICI();
        b.rateOfInterest();
        System.out.println("ROI: ==>"+ b.rateOfInterest());

    }
}