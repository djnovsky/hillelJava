import java.util.Scanner;

/**
 * Created by novsky on 22.02.2016.
 */
public class HomeWork0 {
    //    Напишите программу, которая заменяет символы в почтовом адресе пользователя:
//    @ заменяется на [ at ]
//            . заменяется на [ dot ]
//
//    Пример ввода:
//    person@gmail.com
//    Результат:
//    person[ at ]gmail[ dot ].com

    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter your e-mail: ");

    String stringEmail = scanner.next();

    String newEmail = stringEmail.replace("@", "[at]");
    newEmail = newEmail.replace(".", "[dot]");
    System.out.println("Your e-mail now is: " + newEmail);
}
}