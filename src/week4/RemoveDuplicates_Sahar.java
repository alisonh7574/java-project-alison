package week4;

public class RemoveDuplicates_Sahar {
    public static void main(String[] args) {
        removeDup("BBFFRRIIN");
    }

    public static void removeDup(String letters) {
      String str = letters;
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i))) // If char is not in the result, it is added to result
                result += "" + str.charAt(i); //adds the character to the result string
        System.out.println(result);

    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */