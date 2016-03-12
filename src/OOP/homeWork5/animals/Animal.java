package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public abstract class Animal {

    private String id;
    private String age;
    private String weight;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String voice() {
        return "Hello! ";
    }
}
