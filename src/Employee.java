public class Employee {
    private static int idCount=1;
    private String fIO;
    private int department;
    private double salary;
    private int id;

    public Employee(String fIO, int department, double salary) {
        this.id=idCount++;
        this.fIO=fIO;
        this.department=department;
        this.salary=salary;
    }
    public String getfIO() {
        return fIO;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
