package week3;

public class PrimeNumber_Rusul {


    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number) ; i+= 2) {
            if (number% i ==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int num = 19;
        if (isPrime(num)){
            System.out.println(num + " is a prime number.");
    }else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
