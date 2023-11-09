package week5;

public class Unique_Sahar {
    public static void main(String[] args) {
        uniqueChar("AAABOBIMIIIISIIIIG");
    }
    public static void uniqueChar(String letters){
        String str =letters;
        String unique= "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each)==str.lastIndexOf(each)){
                unique += each;
            }
        }
        System.out.println(unique);
    }


}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */