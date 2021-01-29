package encapsulation;

public class EmployeeEncapsulation {

    private String name;
    private String idNum;
    private String Age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public static void main(String[] args) {
        EmployeeEncapsulation employeeEncapsulation = new EmployeeEncapsulation();
        employeeEncapsulation.name = "Wahaj";
    }
}

