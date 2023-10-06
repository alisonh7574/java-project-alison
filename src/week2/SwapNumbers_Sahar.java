package week2;

public class SwapNumbers_Sahar {
    public static void main(String[] args) {

        int x = 7;
        int y= 10;

        x= x+y;
        y= x-y;
        x= x-y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*
        x= 5+ 10 result 15
        y= 15-10 result 5
        x= 15-5 result 10

         */

    }
}
