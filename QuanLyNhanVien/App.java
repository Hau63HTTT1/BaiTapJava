package QuanLySinhVien;
import java.util.Scanner;
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployManagement employeeManage = new EmployManagement();

    private static void displayEmployees() {
        System.out.print("List of Employee :\n");
        System.out.print(
                "ID             |Name              |Age               |Department            |Code              |Salary rate\n");
        for (Employee employee : employeeManage.getEmployees()) {
            System.out.print(employee.getID() + "            |" + employee.getName() + "           |"
                    + employee.getAge() + "             |" + employee.getDepartment() + "              |"
                    + employee.getCode() + "            |" + employee.getSalaryrate() + "\n");
        }
        ;
        System.out.println("-------------------------------------------------------------------------------------");
    }

    private static void createEmployee() {
        System.out.print("Please!Input the information of employee:\n");
        System.out.print("ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Deparment : ");
        String deparment = scanner.nextLine();
        System.out.print("Code : ");
        String code = scanner.nextLine();
        System.out.print("Salary rate: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        if (employeeManage.createEmployee(id, name, age, deparment, code, salary) == true)
            System.out.print("Added!\n");
        else {
            System.out.print("Please,Check your input , it isn't correct!\n");
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    private static void deleteEmployee() {
        System.out.print("Please!Input the information of employee to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (employeeManage.deleteEmployee(id) == true) {
            System.out.print("Deleted!\n");
        } else {
            System.out.print("Sorry, don't find employee!\n");
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) throws Exception {
        employeeManage.initializeEmployees();
        int exit = 0;
        int select;
        while (exit != 1) {
            System.out.print("Bonjour, my Sir!\n");
            System.out.print("1 :Create employee \n");
            System.out.print("2 :Delete employee \n");
            System.out.print("3 :View employee \n");
            System.out.print("4 :Exit \n");
            System.out.print("Please!Chóose your select : ");
            select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    createEmployee();
                    break;
                case 2:
                    deleteEmployee();
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    System.out.print("Au revoir!");
                    exit = 1;
                default:
                    break;
            }
        }
    }
}
