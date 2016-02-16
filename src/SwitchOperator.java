/**
 * Created by User on 16.02.2016.
 */
public class SwitchOperator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        String operation = "add";
        int result = 0;
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract" :
                result = a-b;
                break;
            case "multiply":
                result = a*b;
                break;
            case "devide":
                result = a/b;
                break;
            default:
                System.out.println("Unknown operaton");
        }
        System.out.println("The result is: " + result);

    }
}
// без break -  выполняет все case поряд