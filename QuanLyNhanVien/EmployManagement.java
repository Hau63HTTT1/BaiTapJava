package QuanLySinhVien;

import java.util.ArrayList;
import java.util.List;

public class EmployManagement {
    private List<Employee> employees;
    public EmployManagement() {
        employees = new ArrayList<Employee>();
    }
    public Employee[] getEmployees() {
        return employees.toArray(new Employee[0]);
    }

    public boolean createEmployee(int id, String name, int age, String department, String code, double salaryRate) {
        Employee employee = new Employee(id,name,age,department,code,salaryRate);
        return employees.add(employee);
    }

    public boolean deleteEmployee(int id) {
        for(Employee employee : employees){
            if(employee.getID() == id){
                return employees.remove(employee);
            }
        }
        return false;
    }

    public void initializeEmployees() {
        //Khởi tạo 10 nhân viên
        for(int i = 0; i <= 10; i++){
            createEmployee(i, "Employee " + i, 20 + i, "Department " + i, "Code " + i, 1000 + i);

        }
    }
}
