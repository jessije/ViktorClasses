package com.Stream.ten;

import com.Stream.nine.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
    //group by example
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList
            (new Person("John", "Smith", 20),
                new Person("Lena", "Esipko", 30),
                new Person("Feride", "Ivanova", 30),
                new Person("Mohsan", "Abudami", 35));
        Map<Integer, List<Person>> personbyAge = personList.stream().collect(Collectors.groupingBy(p -> p.getAge()));
        System.out.println("By age: " + personbyAge);

        //another option
        System.out.println("group by department....");
        Employee[] arrayofEmps = {
            new Employee(1, "Jeff Bezos", 10000.0, Employee.DepartmentType.IT),
            new Employee(2, "Bill Gates", 200000.0, Employee.DepartmentType.IT),
            new Employee(3, "Mark Zukerberg", 3000000.0, Employee.DepartmentType.IT),
            new Employee(4, "Feride", 1000.0, Employee.DepartmentType.IT)
        };
        System.out.println(groupEmployeesByDepartment(Arrays.asList(arrayofEmps)));
    }

    private static Map<Employee.DepartmentType, List<Employee>> groupEmployeesByDepartment
        (List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentType));
    }
}

