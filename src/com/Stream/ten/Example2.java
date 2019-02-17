package com.Stream.ten;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {


        Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 10000.0, Employee.DepartmentType.IT),
            new Employee(2, "Bill Gates", 200000.0, Employee.DepartmentType.IT),
            new Employee(3, "Mark Zukerberg", 3000000.0, Employee.DepartmentType.IT),
            new Employee(4, "Feride", 1000.0, Employee.DepartmentType.IT)
        };
        System.out.println(findEmployeeHigherThanAHoundredThousand(arrayOfEmps));
    }

    public static Employee findEmployeeHighestSalary(Employee[] arrayOfEmps) {
        return Arrays.asList(arrayOfEmps).stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
    }

    public static List<Employee> findEmployeeHigherThanAHoundredThousand(Employee[] arrayOfEmps) {
        return Arrays.asList(arrayOfEmps).stream().filter(e -> e != null).filter(e -> e.getSalary() > 10000).collect(Collectors.toList());
    }
}


