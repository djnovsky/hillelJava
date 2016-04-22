package IO;

import OOP.inheritance.hierarchy.Person;

import java.io.Serializable;

/**
 * Created by User on 19.04.2016.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = 1;
    private final int year;
    private final String brand;
    private final Person owner;
    private transient Tenant tenant;


    public Car(String brand, int year, Person owner) {
        System.out.println("in car constructor");
        this.brand = brand;
        this.year = year;
        this.owner = owner;

    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", owner=" + owner +
                ", tenant=" + tenant +
                '}';
    }
}
