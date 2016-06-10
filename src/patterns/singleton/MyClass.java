package patterns.singleton;

/**
 * Created by Novsky on 08.06.2016.
 */
public class MyClass {
    static int i1;
    int i2;

    public MyClass() {
        i1++;
        i2++;
    }

    public static void main(String[] args) {
        MyClass a = new MyClass();
        MyClass b = new MyClass();

        a.i2 = 5;

        MyClass.i1 = 4;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    @Override
    public String toString() {
        return "i1 = " + i1 + ", i2 = " + i2;
    }
}
