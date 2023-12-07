package week8;

import java.util.Arrays;

public class MoveZerosToEnd_Sahar {
    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros(arr)));

    }

    public static int[] moveZeros(int[] nums) {


        int[] moved = new int[nums.length]; // make new array  [1, 2, 3, 4, 0, 0, 0, 0]
        int index = 0; // index of array 1


        for (int each : nums) { //goes through the original array {1,0,2,0,3,0,4,0}

            if (each != 0){  // if the number is NOT zero
                moved[index++]= each; // if the number is NOT zero it will get added to "moved" array

            }
        }

        return moved;

    }


}
    /*
    Array - Move Zeros to the End

    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]

*/


