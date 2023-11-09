package week6;

public class Password_Sahar {

    public static void main(String[] args) {

        isValidPassword("Password123!");

    }
        public static void isValidPassword(String password) {


            if (password.contains(" ")) {
                System.out.println("Invalid Password"); // if string contains white space = invalid
                return;    // if this condition is false you check next condition:
            }

            boolean has6Chars = password.length() >= 6;
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;  // check these conditions while iterating the string

            for (int i = 0; i < password.length(); i++) {  // i= index number of the string. use to get char of string
                char ch = password.charAt(i);  // it will get each character and assign to ch variable
                if (Character.isUpperCase(ch)) { // use wrapper class character and isUpperCase
                    hasUpperCase = true; // set boolean value to true
                } else if (Character.isLowerCase(ch)) { // if not upper case, use wrapper class for isLowerCase
                    hasLowerCase = true; //boolean will be set to true
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else {  // if none of those then
                    hasSpecialChar = true; // its a special character
                }
            }
    // Create a boolean condition for valid password:
            boolean isValidPassword = has6Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

            if (isValidPassword) {
                System.out.println("Valid Password");
            } else {
                System.out.println("NOT a valid password");
            }

        }
    }

/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */