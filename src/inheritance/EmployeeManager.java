package inheritance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EmployeeManager {
    private List<Employee> employees;


    public EmployeeManager() {

        employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Berivan");
        employee1.setLastName("Aras");
        employee1.setEmail("berivan@hotmail.com");
        employee1.setDepartment("Qa Tester");
        employee1.setCreatedDate(LocalDateTime.now());

        employees.add(employee1);
    }

    public List<Employee> getAll() {
        return employees;
    }

    public void add(Employee employee) {
        employee.setCreatedDate(LocalDateTime.now());
        employees.add(employee);
    }


    public void update(Employee employee){
        for(Employee updateEmployee: employees){
            if(updateEmployee.getId()==employee.getId()){
                updateEmployee.setFirstName(employee.getFirstName());
                updateEmployee.setLastName(employee.getLastName());
                updateEmployee.setUpdatedDate(employee.getUpdatedDate());
            }
        }
    }

    public void delete(int id) {

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
            }
        }

    }
}

