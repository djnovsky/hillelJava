package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class PaintsMain {
    public static void main(String[] args) {

        GreenPaint gp = new GreenPaint();
        System.out.println("To paint 1 m" + "\u00B2" + ", you'll need "
                + gp.consumption() + " litres of " + gp.getColor() + " paint.");
        RedPaint rp = new RedPaint();
        System.out.println("To paint 1 m" + "\u00B2" + ", you'll need "
                + rp.consumption() + " litres of " + rp.getColor() + " paint.");
        YellowPaint yp = new YellowPaint();
        System.out.println("To paint 1 m" + "\u00B2" + ", you'll need "
                + yp.consumption() + " litres of " + yp.getColor() + " paint.");
        BlackPaint bp = new BlackPaint();
        System.out.println("To paint 1 m" + "\u00B2" + ", you'll need "
                + bp.consumption() + " litres of " + bp.getColor() + " paint.");
    }
}
