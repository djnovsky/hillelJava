package OOP.inheritance.hierarchy;

import OOP.inheritance.hierarchy.Employee;

/**
 * Created by User on 04.03.2016.
 */
public class Manager extends Employee {



    public void fire(Employee employee) {
        System.out.println(employee.getPosition() + " " + employee.getName() + " fired by "
                + getPosition() + " " + getName());
    }

    public void greeting() {
        System.out.println("Hello, i'm manager and my name is: " + getName());
    }
}
