package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public abstract class Paints {

    private String color;

    public abstract int consumption();

    public Paints(String color){
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = this.color;
    }
}
