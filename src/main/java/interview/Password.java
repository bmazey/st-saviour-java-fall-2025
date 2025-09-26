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

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";

        String password = "";

        // now we pull a random character (letter) using letters.length() and letters.charAt() (repeat lines for each character)
        int r = random.nextInt(letters.length());
        password += letters.charAt(r);
        System.out.println("The random number is: " + r);

        r = random.nextInt(letters.length());
        password += letters.charAt(r);

        r = random.nextInt(letters.length());
        password += letters.charAt(r);

        r = random.nextInt(letters.length());
        password += letters.charAt(r);

        r = random.nextInt(letters.length());
        password += letters.charAt(r);

        // number by using digits.length() and digits,charAt() (repeat lines for each character)
        r = random.nextInt(digits.length());
        password += digits.charAt(r);

        r = random.nextInt(digits.length());
        password += digits.charAt(r);

        r = random.nextInt(digits.length());
        password += digits.charAt(r);

        r = random.nextInt(digits.length());
        password += digits.charAt(r);

        // symbols by using symbols.length() and symbols.charAt()
        r = random.nextInt(symbols.length());
        password += symbols.charAt(r);
        
        return password;
    }
}
