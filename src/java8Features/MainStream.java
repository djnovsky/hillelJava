package java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.stream.Collectors.*;

/**
 * Created by User on 13.06.2016.
 */
public class MainStream {
    public static void main(String[] args) {


        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(200, "Red", 9));
        apples.add(new Apple(250, "Green", 10));
        apples.add(new Apple(100, "Green", 11));
        apples.add(new Apple(250, "Yellow", 15));
        apples.add(new Apple(230, "Green", 16));

        Random random = new Random();
        Supplier<Integer> integerSupplier = random::nextInt;



        Stream.generate(integerSupplier)
                .filter(integer -> integer % 2 == 0)
                .limit(10)
                .forEach(System.out::println);


        Supplier<Apple> appleSupplier = Apple::new;




    }

    private static Optional<Apple> parallelSortedStreamExample(List<Apple> apples) {
        //
//        if (expensiveApple.isPresent()){
//            System.out.println(expensiveApple);
//        }
        return apples.parallelStream()
                .filter(apple -> apple.getPrice() > 10)
                .sorted(Comparator.comparing(Apple::getColor))
                .findAny();
        //expensiveApple.ifPresent(System.out::println);
    }

    private static boolean isThereExpensiveApples(List<Apple> apples) {
        return apples.stream()
                .anyMatch(apple -> apple.getPrice() > 10);
    }

    private static void mapExample(List<Apple> apples) {
        //        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
//        Predicate<Apple> isHeavy = apple -> apple.getWeight() > 200;


//        List<String> colors = apples.stream()
//                .map(Apple::getColor)
//                .collect(Collectors.toList());

        Predicate<String> isYellow = letter -> letter.equalsIgnoreCase("Y");
        Predicate<String> notYellow = isYellow.negate(); //инвертировать метод
        List<String> colorsList = apples.stream()
                .map(Apple::getColor)
                .map(MainStream::extractFirstChar)
                .filter(notYellow)
                .collect(Collectors.toList());
        System.out.println(colorsList);
    }

    public static String extractFirstChar(String string) {
        return string.substring(0, 1);
    }

    private static void limitExample(List<Apple> apples) {
        List<Apple> greenApples = apples.stream()
                .filter(Apple::isGreen)
                .filter(Apple::isHeavy)
                .limit(2)
                //.collect(toList());
                .collect(Collectors.toList());

        System.out.println(greenApples);
    }

    private static void forEachExample(List<Apple> apples) {
        apples.stream()
                .filter(Apple::isGreen)
                .filter(Apple::isHeavy)
                .forEach(System.out::println);
    }

    /*public static boolean isGreen(Apple apple){
        return apple.getColor().equals("Green");
    }

    public static boolean isHeavy (Apple apple){
        return apple.getWeight() > 200;
    }*/
}
