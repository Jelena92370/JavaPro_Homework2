package task2;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private int departmentId;

    public Employee(int id, String name, String position, double salary, int departmentId) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }
}
