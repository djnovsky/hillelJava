package generics;

import OOP.inheritance.hierarchy.Employee;
import OOP.inheritance.hierarchy.Manager;
import OOP.inheritance.hierarchy.Person;

import java.util.*;

/**
 * Created by User on 06.05.2016.
 */
public class GenericsMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager());
        Employee employee = employees.get(0);
        employee.getPosition();

        Manager manager = new Manager();
        manager.setName("Vasya");
        Employee employee1 = new Employee();

        employee1 = manager;
        employee1.greeting();

        List<Manager> managers = new ArrayList<>();
        employees.add(new Employee());
        employee = employees.get(0);

        managers.add(new Manager());
        Manager manager1 = managers.get(0);

        //employee = manager;
        //employees = managers;

        employees.add(manager);

        System.out.println(employees.size());
        employees.get(2).greeting();

        fire(employees);
        fire(managers);

        Pair<String,Person> personPair = new Pair<>("Vasjok", new Person("Oksana"));
        String first = personPair.getFirst();
        Person second = personPair.getSecond();
        second.greeting();

        Map<Person, String> personStringMap = new HashMap<>();
        personStringMap.put(manager, first);

        Employee singleEmployee = new Employee("Petya");

        fire(Collections.singletonList(singleEmployee));//list одного Employee

        fire(Collections.<Employee>emptyList());//пустой лист

        copy(employees, new ArrayList<>());

        List<Employee> employees1 = copy(managers);


    }

    /*private static void fire(List<Manager> managers) {
        for (Manager employee : managers) {
            System.out.println(employee.getName() + " is fired");
        }
    }*/

    public static void fire(List<? extends Employee> employees){
        for (Employee employee: employees){
            System.out.println(employee.getName() + " is fired");
        }

        //employees.add(new Employee());
    }

    public static void addEmployee(List<? super Employee> employees){
        employees.add(new Employee());
        //Employee employee = employees.get(0);
        Object employee = employees.get(0);
    }

    public static <T> void copy(List<T> source, List<? super T> target){
        target.addAll(source);
    }

    public static <T> List<T> copy(List<? extends T> source){
        List<T> target = new ArrayList<>();
        target.addAll(source);
        return target;
    }


}
