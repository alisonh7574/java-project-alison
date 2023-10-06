package week2;

public class ConsecutiveNumbers_Sahar {
    public static void main(String[] args) {

        int n = 100;
        for (int i = 1; i <= n; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }

            if (i % 3 == 0) {
                result += "Test";
            }

            if (i % 5 == 0) {
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? i : result);


        }
    }
}