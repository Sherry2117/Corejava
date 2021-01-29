package encapsulation;

public class TestEmp {

    public static void main(String[] args) {
        EmployeeEncapsulation employeeEncapsulation = new EmployeeEncapsulation();
        employeeEncapsulation.setName("Wahaj");
        employeeEncapsulation.setIdNum("EMP000112");
        System.out.println("Emp" +employeeEncapsulation.getIdNum());
    }
}
