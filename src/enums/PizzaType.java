package enums;

/**
 * Created by User on 30.05.2016.
 */
public enum PizzaType {
    CHEESE("chezzz"),
    MEAT("meeeeet");

    private String name;

    PizzaType(String name) {
        this.name = name;
    }

    public static PizzaType of(String string) {
        switch (string) {
            case "cheese":
                return CHEESE;
            case "meat":
                return MEAT;
            default:
                throw new RuntimeException("sdf");
        }
    }

    public String getName() {
        return name;
    }
}
