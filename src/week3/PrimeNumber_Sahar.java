package week3;

public class PrimeNumber_Sahar {

    public static void main(String[] args) {

        System.out.println(isPrime(15));

    }
    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n% i == 0){
                return false;
            }
        }
        return true;


    }

}

// 1. Numbers -- Prime Number
//Write a method that can check if a number is prime or not
