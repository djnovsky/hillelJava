package OOP.inheritance.hierarchy;

/**
 * Created by User on 04.03.2016.
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void greeting() {
        System.out.println("Hello, I'm person. My name is: " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        } else {
            Person other = (Person) o;
            return this.getName().equals(other.getName());
        }
    }
}

