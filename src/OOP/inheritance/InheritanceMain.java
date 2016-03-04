package OOP.inheritance;

import OOP.inheritance.hierarchy.Employee;
import OOP.inheritance.hierarchy.Manager;
import OOP.inheritance.hierarchy.Person;

/**
 * Created by User on 04.03.2016.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");
        employee.greeting();

        Manager manager = new Manager();
        manager.setPosition("director");
        ;
        manager.setName("Igor");

        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee;//UPCAST
        Person managerAsPerson = manager;
        employeeAsPerson.getName();
        //нельзя вызвать методы не персона
        //employeeAsPerson.getPosition();
        managerAsPerson.getName();
        //managerAsPerson.getPosition();

        //Manager personAsManager = person;
        employeeAsPerson = person;
        //ClassCastException
        //Employee employee1 = (Employee) employeeAsPerson;//DOWNCAST
        //instanceof - выяснить принадлежит ли присвоение
        if (employeeAsPerson instanceof Employee) {
            System.out.println("He is employee");
        } else {
            System.out.println("He is not employee");
        }

        //System.out.println(employee1.getPosition());
        person.greeting();
        manager.greeting();
        employee.greeting();

        Person somebody = employee;
        somebody.greeting();
        System.out.println("------------------------");
        speak(person);
        speak(employeeAsPerson);
        speak(manager);

        System.out.println(person.getName());
        System.out.println(employee.getName());
        System.out.println(manager.getName());

//        Employee employee1 = new Employee();
//        employee1.setName("Ivan");
//
//        printName(employee1);

        Object o = new Employee();
        o = "SDF";
    }

    public static void speak(Person person){
        person.greeting();
    }
    public static void printName(Person person){
        System.out.println("My name is " + person.getName());
    }
}
