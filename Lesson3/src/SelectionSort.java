/**
 * Created by User on 19.02.2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 8};

        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j]<min){
                    min = array[j];
                    minIndex = j;

                }
            }
            int buf = array[i];
            array[i] = array[minIndex];
            array[minIndex] = buf;
        }
        Utils.printArray(array);
    }

}
