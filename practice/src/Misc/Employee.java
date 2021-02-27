package Misc;

public class Employee {

    Address address; //tight coupling
    Employee(){
        address = new Address();
    }
}
