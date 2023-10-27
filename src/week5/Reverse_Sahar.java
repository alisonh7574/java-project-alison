package week5;

public class Reverse_Sahar {
    public static void main(String[] args) {
        reverseWord("Anna");
    }
    public static void reverseWord(String word){
        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
        if (word.equalsIgnoreCase(reverse)){
            System.out.println("Word is palindrome");
        }else{
            System.out.println("Word is not palindrome");
        }
    }





}
/*
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */