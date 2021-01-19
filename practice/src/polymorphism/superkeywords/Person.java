package polymorphism.superkeywords;

public class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person {
    float salary;

    Employee(int id, String name, float salary){
        super(id, name); //reusing parent constructor
          this.salary = salary;
    }
    void display () {
        System.out.println("ID : "+id +"name : "+name+" salary: "+salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(45, "Sherry", 991999f);
        employee1.display();
    }
}
