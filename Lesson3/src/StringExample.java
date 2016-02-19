/**
 * Created by User on 19.02.2016.
 */
public class StringExample {
    public static void main(String[] args) {
        String str = "Some string";
        String str1 = new String(" Some string");


        char symbol = str.charAt(3);
        System.out.println(symbol);

        int sum = getNumberOfSymbols('s', str);
        System.out.println("Number of s in " + str + "is" + sum);

        String str4 = "\"Animal\"";
        System.out.println(str4);

        //Concat
        String str3 = str4.concat(str1);
        System.out.println(str3);

        String str5 = " Word with spaces ";
        System.out.println(str5.trim());

        String str6 = str5.replace("with", "something");
        System.out.println("Replace example: " + str6);


        //5 - inclusive, 10- exclusive
        String str7 = str5.substring(5, 10);
        System.out.println("Subtracting example: " + str7);

        String[] str8 = str6.split(" ");
        System.out.println(str8);

    }

    private static int getNumberOfSymbols (char symbol, String s){
        int sum =0;

        for (int i = 1; i<s.length();i++){
            if (s.charAt(i)==symbol){
                sum++;
            }
        }
        return sum;

    }
}
