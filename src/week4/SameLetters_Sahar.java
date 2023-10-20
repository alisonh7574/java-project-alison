package week4;

import java.util.Arrays;

public class SameLetters_Sahar {
    public static void main(String[] args) {

        //   isAnagram("part", "trap");

        String str1 = "part";
        String str2 = "trap";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst("" + str1.charAt(i), ""); // replacing first char with empty string and assign to str2
        }
        if (str2.isEmpty()){  // when str isEmpty then words are anagram
            System.out.println("Words are anagram");
        }else{
            System.out.println("Words are NOT anagram");
        }


    }

    public static void isAnagram(String word1, String word2) {
        String str1 = word1;
        String str2 = word2;
        String result1 = "";
        String result2 = "";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (char each : ch1) {
            result1 += each;
        }
        for (char each : ch2) {
            result2 += each;
        }
        if (result1.equals(result2)) {
            System.out.println("Words are anagrams");
        } else {
            System.out.println("Words are NOT anagrams");
        }

    }
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */


}
