package encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAcc_no(1234567890l);
        acc.setName("Wahaj");
        acc.setEmail("schougule27may@gmail.com");
        acc.setAmount(45f);
        Object object;
        System.out.println("Account object :" +acc);
        System.out.println(acc.getAcc_no() + "" + acc.getAmount() + "" + acc.getEmail() + "" + acc.getName());

    }
}
