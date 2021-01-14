package thisusage.instance.variables;

public class StudentWithNotThis {
    int rollNo;
    String name;
    //constructor
    StudentWithNotThis(int rNo, String sName) {
        this.rollNo = rNo;
        this.name = sName;
    }
    //Method
    void display() {
        System.out.println("rollNo: -"+rollNo + "::" + "name : -" +name);

    }
    //Start Run / entry point
    public static void main(String[] args) {
        StudentWithNotThis student1 = new StudentWithNotThis(45, "sherry");
        StudentWithNotThis student2 = new StudentWithNotThis(01, "Wahaj");
       student1.display();
       student2.display();
    }
}

