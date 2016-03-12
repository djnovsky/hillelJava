package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public class AnimalMain {

    public static void main(String[] args) {
        Dog bonya = new Dog("Bonya");
        System.out.println(bonya.voice());
        Fish nemo = new Fish();
        System.out.println(nemo.voice());
        GuideDog barsik = new GuideDog("Barsik");
        System.out.println(barsik.voice());
        Wolf akella = new Wolf();
        System.out.println(akella.voice());
        Giraffe marty = new Giraffe();
        System.out.println(marty.voice());


    }
}
