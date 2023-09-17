package week1;

public class OddOrEven_Mohamed {

    public static String identify(int number){
        String result = "";

        if (number%2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(identify(2));

        System.out.println(identify(3));

        System.out.println(identify(100));

        System.out.println(identify(205));

    }
}
