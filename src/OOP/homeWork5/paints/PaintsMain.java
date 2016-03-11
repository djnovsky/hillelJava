package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class PaintsMain {
    public static void main(String[] args) {

        GreenPaint gp = new GreenPaint("green");
        System.out.println("To paint 10 m" + "\u00B2" + ", you'll need "
                + gp.consumption() + " litres of " + gp.getColor() + " paint.");
        RedPaint rp = new RedPaint("red");
        System.out.println("To paint 10 m" + "\u00B2" + ", you'll need "
                + rp.consumption() + " litres of " + rp.getColor() + " paint.");
        YellowPaint yp = new YellowPaint("yellow");
        System.out.println("To paint 10 m" + "\u00B2" + ", you'll need "
                + yp.consumption() + " litres of " + yp.getColor() + " paint.");
        BlackPaint bp = new BlackPaint("black");
        System.out.println("To paint 10 m" + "\u00B2" + ", you'll need "
                + bp.consumption() + " litres of " + bp.getColor() + " paint.");
    }
}
