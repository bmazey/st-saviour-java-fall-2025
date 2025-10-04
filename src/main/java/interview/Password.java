package interview;

import java.util.Random;

public class Password {

    /*
     * The generatePassword() method accepts no arguments and returns a String with the following characteristics:
     *  - The first 5 characters are letters.
     *  - The next 4 characters are digits.
     *  - The final character is a symbol.
     *  - The length of the String is 10. 
     *  - It's relatively unlikely that two generated Strings are the same.
     */
    public static String generatePassword() {
        Random random = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_+=[]{}|;:,.<>?/`~";
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < 4; i++) {
            password.append(letters.charAt(random.nextInt(letters.length())));
        }

        for(int i = 0; i < 4; i++) {
            password.append(digits.charAt(random.nextInt(digits.length())));
        }
        password.append(symbols.charAt(random.nextInt(symbols.length()))); 
        return password.toString();
    }
    public static void main(String[] args) {
        System.out.println(generatePassword());
    }
}
