package week6;

public class ArrayMax_Sahar {

    public static void main(String[] args) {


        int[] array = {-15, 2, -11, -25, -13, -4, -9};
        System.out.println(maxNumber(array));

    }

    public static int maxNumber(int[] array) {

        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible value
    //    int max = array[0]  another option, use first index as default then move to the next one

        for (int each : array) { // go through each number, each represents each number
            if (each > max) { // if each is greater than a number
                max = each; // Update max if a larger number is found
            }
        }

        return max;
    }


}
//Array -- Find Maximum - Write a method that can find the maximum number from an int Array