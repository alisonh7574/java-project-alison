package week3;

public class ReverseNegativeNumber_Sahar {
    public static void main(String[] args) {

        System.out.println(reverseNegative(25));
    }

    public static int reverseNegative(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }


}
// 2. Numbers -- Reverse negative number
//  Write a return method that can reverse negative number and return it as int
