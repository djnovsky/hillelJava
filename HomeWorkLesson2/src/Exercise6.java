/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise6 {
    //7. Найти сумму всех четных и сумму всех нечетных элементов массива
    public static void main(String[] args) {
        int[] numbers = { 8, 2, 6, 7, 0, 1, 4, 9, 5, 3, 24, 3, 16, 43 };


        int i = 0;
        int sumEven = 0;
        int sumUneven = 0;
        for (i=0; i < 14; i++){
            if (numbers[i]%2 ==0){
                sumEven = numbers[i] + sumEven;
            } else{
                sumUneven = numbers[i] + sumUneven;
            }
            }
        System.out.println(sumEven);
        System.out.println(sumUneven);
        }
    }
