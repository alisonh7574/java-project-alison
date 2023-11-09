package week6;

public class SumOfDigits_Sahar {

    public static void main(String[] args) {

        sumOfDigits("A1B2C3D4E5");
    }

    public static void sumOfDigits(String str){

        int sum = 0; // place to add the numbers

        for (int i = 0; i < str.length(); i++) {  //use for loop to go through each char
            char ch = str.charAt(i);  // i is acting as the index #, assign it to variable ch
            if (Character.isDigit(ch)){ // use wrapper class to use isDigit, if digit it can be converted to a number
              sum += Integer.parseInt(""+ch); // convert char to int by parse int (parse because it came from string)convert ch to string add ""
             //  Integer.valueOf("" + ch);  another option -- not a big difference between parseInt
            }
        }
        System.out.println(sum);




    }
}


// String -- sum of digits in a string:
//Write a method that can return the sum of the digits in a string