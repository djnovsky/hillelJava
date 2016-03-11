package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 11.03.2016.
 */
public class Crypting2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Plese enter message to crypt: ");
        String cryptedString = scanner.nextLine();
        System.out.print("Plese enter keyword: ");
        String keyString = scanner.nextLine();
        char[] key = keyString.toCharArray();
        char[] result = encode(cryptedString, key);
        String uncryptedString = decode(result,key);
        printArray(result);


    }

    public static char[] encode(String cryptText, char[] charKey) {
        char[] txt = cryptText.toCharArray();
        char[] key = charKey;
        char[] res = new char[cryptText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (char) (txt[i] ^ key[i % key.length]);
        }

        return res;
    }

    public static String decode(char[] cryptText, char[] charKey) {
        char[] res = new char[cryptText.length];
        char[] key = charKey;

        for (int i = 0; i < cryptText.length; i++) {
            res[i] = (char) (cryptText[i] ^ key[i % key.length]);
        }

        return new String(res);
    }

    public static void printArray(char[] array) {
        System.out.print("Crypted: ");
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
        }


    }
}
