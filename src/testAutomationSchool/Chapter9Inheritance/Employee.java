package testAutomationSchool.Chapter9Inheritance;

public class Employee extends Person { //extends - key word for inheritance from parent class

    private String employeeId;
    private String title;

    public Employee(){
        super("angie");
        System.out.println("In employee default constructor");
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
