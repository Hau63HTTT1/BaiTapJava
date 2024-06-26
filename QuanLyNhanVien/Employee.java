package QuanLySinhVien;

public class Employee {
    private int id ;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryrate;
    public Employee(int id, String name, int age,String department, String code, double salaryrate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryrate = salaryrate;

    }
    public void setID(int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void  setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
    public void setSalaryrate(double salaryrate){
        this.salaryrate = salaryrate;
    }
    public double getSalaryrate(){
        return salaryrate;
    }
}
