package week3;

public class ReverseNegativeNumber_Sahar {
    public static void main(String[] args) {

        int number = -123;
        reverseNegative(number);
    }

    public static void reverseNegative(int number) {
        String result = "";
        String s = String.valueOf(number);

        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);

        }

        String s1 = "-" + result.substring(0, result.length() - 1);

        System.out.println(s1);
    }


    }



// 2. Numbers -- Reverse negative number
//  Write a return method that can reverse negative number and return it as int
