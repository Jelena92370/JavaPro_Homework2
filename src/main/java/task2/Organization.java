package task2;

import java.util.List;

public class Organization {

    private String name;
    private List<Department> departments;
    private List<Employee> employees;

    public Organization(String name, List<Department> departments, List<Employee> employees) {
        this.name = name;
        this.departments = departments;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
