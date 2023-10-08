package task2;

import java.util.List;

public class Director extends Employee {

    private List<Integer> departmentIds;

    public List<Integer> getDepartmentIds() {
        return departmentIds;
    }

    public Director(int id, String name, String position, double salary, int departmentId, List<Integer> departmentIds) {
        super(id, name, position, salary, departmentId);
        this.departmentIds = departmentIds;


    }

}
