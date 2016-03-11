package OOP.HomeWork4;

/**
 * Created by novsky on 07.03.2016.
 */
public class Crypting {
    public static void main(String[] args) {


        String cryptedString = "ALSO GRAPHICAL CONTROL ELEMENT OR CONTROL";
        char key = 'g';
        char[] result = encode(cryptedString, key);
        System.out.println("Uncrypted String: " + cryptedString);
        String uncryptedString = decode(result,key);
        printArray(result);
        System.out.println("Uncrypted String: " + uncryptedString);


    }

    public static char[] encode(String pText, char pKey) {
        char[] txt = pText.toCharArray();
        char key = pKey;
        char[] res = new char[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (char) (txt[i] ^ (i % key));
        }

        return res;
    }

    public static String decode(char[] pText, char pKey) {
        char[] res = new char[pText.length];
        char key = pKey;

        for (int i = 0; i < pText.length; i++) {
            res[i] = (char) (pText[i] ^ (i%key));
        }

        return new String(res);
    }

    public static void printArray(char[] array) {
        System.out.print("Crypted: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println(array[i]);
            else
                System.out.print(array[i]);
        }


    }
}
