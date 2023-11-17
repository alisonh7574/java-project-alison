package week7;

import java.util.Arrays;

public class ArraySortDesc_Sahar {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortDescending(new int[]{45, 14, 6, 95, 16, -19, 39})));

    }

    public static int[] sortDescending(int[] array) {

        for (int i = 0; i < array.length; i++) { // first loop to iterate through
            for (int j = 0; j < array.length; j++) { // start from the beginning and compare. add length-1 to not go out of bounds bc youre checking the number next to j
                if (array[i] > array[j]) { // comparing j with j+1 which is the j right before
                    int temp = array[j]; // temp varible to hold j
                    array[j] = array[i];   // Swap array[j] and array[j+1]
                   array[i] = temp;
                }
            }

        }
        return array;
    }

}

/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};

arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */