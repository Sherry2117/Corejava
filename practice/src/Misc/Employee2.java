package Misc;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Employee2 {

    Address address;
    Employee2(Address address) {
        this.address = address; //loosely coupled

    }

    public static void main(String[] args) {
        Address addr1 = new Address();
        //addr1.set ("asda);
        Employee2 e1 = new Employee2(addr1);
    }
}
