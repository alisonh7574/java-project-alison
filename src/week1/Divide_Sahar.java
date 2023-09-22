package week1;

public class Divide_Sahar {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        int count = 0;

        while(a >= b){
            a= a-b;
            count = count +1;
        }
        System.out.println("Result = " + count);



    }
}

//Divide without / operator: write a method that can divide two numbers without using division operator
