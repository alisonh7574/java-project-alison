package week10;

import java.util.Arrays;

public class ArrayListSortAscending_Sahar {

    public static void main(String[] args) {

        int[] arr = {5, 7, 3, 9, 4, 6, 1};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int[] arr){




        for (int i = 0; i < arr.length; i++) { // going through original array

            for (int j = 0; j < arr.length -1; j++) { // inner loop to compare, -1 added so j+1 doesnt go out of bounds
                if (arr[j] > arr[j+1]){ // when the array of j is bigger than the one after it [j+1] you swap
                    int temp = arr[j];  // create a temp variable so you dont lose the variable you are swapping
                    arr[j] = arr[j+1]; // this swaps j with j+1
                    arr[j+1] = temp;
                }

            }

        }
        return arr;

    }



}

//ArrayList - sorting in ascending
//Write a method that can sort the ArrayList in Ascending order without using the sort method.