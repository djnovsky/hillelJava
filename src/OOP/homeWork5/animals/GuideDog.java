package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public class GuideDog extends Dog {

    private boolean isTrained;

    public GuideDog(String name) {
        super(name);
    }

    public String takeHome() {
        return "I can take you home.";
    }
    @Override
    public String voice() {
        return super.voice() + takeHome();
    }

}
