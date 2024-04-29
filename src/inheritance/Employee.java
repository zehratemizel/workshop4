package inheritance;

public class Employee extends inheritance.User{
    private String department;

    public Employee(){

    }

    public Employee(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
