package polymorphism.finalkeywords;

public class Employee {

    final String PAN_NUMBER;
//if you put final you cannot override
    Employee(String panNumber) {
        PAN_NUMBER = panNumber;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("SA-12345");
       // emp1.PAN_NUMBER="Change";
        Employee emp2 = new Employee("SAN-12345");
    }
}
