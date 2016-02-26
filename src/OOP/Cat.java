package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Cat {

    private String color;
    private String name;
    private int birthYear;
    private String[] vaccines = new String[10];
    private int vaccineCount;


    //public  Cat(){}//default constructor

    //конструктор
    public Cat(String name, String color, int birthYear) {
        //System.out.println("cat is creating");
        //vaccines = new String[10];
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
        //System.out.println("cat is created");
    }

        public void meow() {
            System.out.println("meow!!!");
        }


//    public void init(String name, String color, int birthYear){
//        vaccines = new String[10];
//        this.name = name;
//        this.color = color;
//        this.birthYear = birthYear;
//
//    }



    public void vaccinate(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
        meow();
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

}
