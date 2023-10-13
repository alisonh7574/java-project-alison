package week3;

public class ReverseNegativeNumber_Alison {

//this      -123
    //to this   -321


    public static void reverse(int number) {
        if (number < 0) {
            System.out.print("-");
            reverse(number * -1);
        } else if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
    }
}
