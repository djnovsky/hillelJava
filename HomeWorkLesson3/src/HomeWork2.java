import java.util.Scanner;

/**
 * Created by novsky on 22.02.2016.
 */
public class HomeWork2 {
//    3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
//    Определить количество таких слов в тексте, в котором все слова введены через запятую.
//
//    Пример ввода:
//    deleveled, evitative, cat, dog, deified
//    Результат:
//    There are 3 palindromes in the text
//
//    PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your word to reverse: ");
        original = in.nextLine();
        int lenght = original.length();

        for (int i = lenght - 1; i>=0;i--){
            reverse = reverse + original.charAt(i);
        }

        if (reverse.equals(original)){
            System.out.println("Your word is Polindrom. " + reverse + " is reversed " + original);
        } else {
            System.out.println(original + " is not Polindrom.");
        }
    }
}
