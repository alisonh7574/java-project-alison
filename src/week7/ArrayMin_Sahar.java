package week7;

public class ArrayMin_Sahar {

    public static void main(String[] args) {


        int[] array = {15, -2, 11, 25, 13, 4, 9};
        System.out.println(minNumber(array));

    }

    public static int minNumber(int[] array) {

        int min = Integer.MAX_VALUE; // Initialize min with the largest possible value
        //    int min = array[0]  another option, use first index as default then move to the next one

        for (int each : array) { // go through each number, each represents each number
            if (each < min) { // if each is less than a number
                min = each; // Update min if a smaller number is found
            }
        }
        return min;
    }

}
//Write a method that can find the Minimum number from an int Array