package week7;

import java.util.Arrays;

public class ArraySortAsc_Sahar {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(new int[]{5, 34, 6, 80, 16, -19, 39})));

    }

    public static int[] sortAscending(int[] array) {

        for (int i = 0; i < array.length-1; i++) { // first loop to iterate through

            for (int j = 0; j < array.length; j++) { // start from the beginning and compare. add length-1 to not go out of bounds bc youre checking the number next to j
                if (array[i] < array[j]) { // comparing j with j+1 which is the j right after
                    int temp = array[i];
                    array[i] = array[j];   // Swap array[j] and array[j+1]
                    array[j] = temp;
                }
            }

        }
        return array;
    }

}




/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};

arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */