/**
 * Created by User on 19.02.2016.
 */
public class ArrayConsoleInput {
    public static void main(String[] args) {

        int[] array = Utils1.getArrayFromConsole();

        int sum = findTheSumOfAllElementsOfTheArray(array);

        Utils1.printArray(array);

        System.out.println("Sum is: "+sum);
    }

        private static int findTheSumOfAllElementsOfTheArray (int[] array){
        int sum = 0;
        for ( int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
        }
}
