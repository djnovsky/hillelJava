package generics;

import OOP.inheritance.hierarchy.Employee;
import OOP.inheritance.hierarchy.Manager;
import OOP.inheritance.hierarchy.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 06.05.2016.
 */
public class GenericsMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager());
        Employee employee = employees.get(0);
        employee.getPosition();


    }
}
