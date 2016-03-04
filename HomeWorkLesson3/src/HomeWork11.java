import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by novsky on 22.02.2016.
 */
public class HomeWork11 {
//    String newWord = "";
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
        String newWord = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        newWord = scanner.nextLine();



        if(newWord.length()<5){
            System.out.println("Your word is too short for changing: " + newWord);;
        } else {
            String[] everyCommonWord = newWord.split(" ");
            for (int i=0; i==everyCommonWord.length; i++) {
                changingTheWord(newWord);
                printArray(everyCommonWord);
            }
        }

    }

    public static void changingTheWord(String newWord) {
        char firstChar = newWord.charAt(0);
        char lastChar = newWord.charAt(newWord.length()-1);
        int numberOfCharsInside = newWord.length()-2;
        //System.out.println("Your word now is: "+firstChar+numberOfCharsInside+lastChar);
    }

    public static void splittingWord(String newWord){
        newWord.split(" ", 2);
    }
    public static void printArray (String[] array) {
        System.out.print("Words: ");
        for (int i=0; i <array.length; i++){
            if (i == array.length -1)
                System.out.println(array[i]);
            else
                System.out.print(array[i] + ",");
        }
    }

        }





