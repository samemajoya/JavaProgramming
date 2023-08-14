package chapter9Inheritance;

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee(){
        super("JOYA");
        System.out.println("In employee default constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
