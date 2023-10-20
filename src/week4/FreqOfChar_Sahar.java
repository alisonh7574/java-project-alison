package week4;

public class FreqOfChar_Sahar {
    public static void main(String[] args) {

        frequencyOfChar("TEEOOS00TWPPVVSSTSSS");
    }


    public static void frequencyOfChar(String letters) {
        String str = letters;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) { // if they are the same
                    count++; // adds to count
                }
            }
            result = str.charAt(i) + "" + count;  // result = char + count concat
            str = str.replace("" + str.charAt(i), ""); // removes all occurrences of char from string
            System.out.print(result);
        }
    }
}
        /*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
