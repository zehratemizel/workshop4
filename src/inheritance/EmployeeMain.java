package inheritance;

import java.time.LocalDateTime;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> responses = employeeManager.getAll();

        User user = new Employee();


        Employee employee1 = new Employee();
        employee1.setId(3);
        employee1.setFirstName("Ahmet");
        employee1.setLastName("Yılmaz");
        employee1.setEmail("Ahmet@hotmail.com");
        employee1.setDepartment("Finans");


        employeeManager.add(employee1);

        for (Employee employee : responses) {
            System.out.println("Kayıt olan Çalışanın Adı ve Soyadı : " +
                    employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Email bilgisi : " + employee.getEmail());
            System.out.println("Departmanı : " + employee.getDepartment());
            System.out.println("Sisteme kayıt tarihi : " + employee.getCreatedDate());
        }


        System.out.println("-----Create-------");


        for(Employee employee2: responses){
            System.out.println("Kayit olan Çalışanın Adi ve Soyadi: " +  employee2.getFirstName() + " " + employee2.getLastName());
            System.out.println("Email bilgisi: " + employee2.getEmail());
            System.out.println("Bölüm: " + employee2.getDepartment());
            System.out.println("Sisteme kayit tarihi: " + employee2.getCreatedDate());
        }


        System.out.println("-----Update-------");

        Employee updatedEmployee = new Employee();
        updatedEmployee.setId(3);
        updatedEmployee.setFirstName("Seymanur");
        updatedEmployee.setLastName("Sirakaya");
        updatedEmployee.setUpdatedDate(LocalDateTime.now());

        employeeManager.update(updatedEmployee);

        for (Employee employee4:responses){
            System.out.println(employee4.getFirstName() + " " + employee4.getLastName() + " " + employee4.getCreatedDate());
        }

        System.out.println("-------Delete-------------");

        employeeManager.delete(1);
        for(Employee employee3:responses){
            System.out.println(employee3.getFirstName() + " "+ employee3.getLastName());
        }


    }
}
