import java.util.Scanner;

/**
 * Created by novsky on 22.02.2016.
 */
public class HomeWork11 {
    public static void main(String[] args) {


//    2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове,
// такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
//    Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.
//
//    Пример ввода:
//    internationalization localization cat elephant monitor
//    Результат:
//    i18n l10n cat e6t m5r
//
//    PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит, который поместит слова в массив и для каждого из них вызовет вашу функцию

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String newWord = scanner.nextLine();


        String[] string = newWord.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() > 5) {
                changeThisWord(string, i);
            } else {

            }

        }
        printArray(string);
    }

    public static void changeThisWord(String[] string, int i) {
        char firstChar = string[i].charAt(0);
        char lastChar = string[i].charAt(string[i].length() - 1);
        int numberOfCharsInside = (string[i].length() - 2);
        string[i] = "" + firstChar + numberOfCharsInside + lastChar;
    }


    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
    }

}





