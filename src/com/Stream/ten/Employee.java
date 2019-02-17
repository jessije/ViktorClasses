package com.Stream.ten;

public class Employee {
    private int id;
    private String name;
    private Double salary;
    private DepartmentType departmentType;

    public Employee(int id, String name, Double salary, DepartmentType departmentType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentType = departmentType;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            ", department type:" + departmentType+
            '}';
    }
    enum DepartmentType{
        IT,
        SALES,
        HR,
        FINANCE,
        LOGISTICS
    }
}



