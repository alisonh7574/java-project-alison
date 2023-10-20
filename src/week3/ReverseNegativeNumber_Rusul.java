package week3;

public class ReverseNegativeNumber_Rusul {

    public static int reverseNegative(int number) {

        if (number < 0) {
            // If the number is negative, remove the negative sign and reverse it
            number = -number;
        }
        return number;
    }

        }


