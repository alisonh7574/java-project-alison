package week8;

import java.util.Arrays;

public class SumtoZero_Sahar {

    public static void main(String[] args) {
        int num = 4;
        int[] result = sumToZero(num);
        System.out.println(Arrays.toString(result));
    }


    public static int[] sumToZero(int num) {

        int[] result;

        if (num % 2 == 1) { // checks if number is odd
            // For odd N, return an array with N-1 integers and 0
            result = new int[num];

            for (int i = -(num / 2); i <= num / 2; i++) {
                if (i == 0) continue;
                result[i + (num / 2) - 1] = i;
            }
        } else {
            // For even N, return an array with N/2 positive and N/2 negative integers
            result = new int[num];
            for (int i = -(num / 2); i < num / 2; i++) {
                result[i + (num / 2)] = i;
            }
        }

        return result;
    }



}
    /*
    Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
    */



