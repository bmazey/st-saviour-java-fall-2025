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
        // TODO
        // HINT You will have to use a bounded random number generator for this method.
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int-

        // HINT Using the charAt() method is a great technique for pulling chars from a String.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-

        Random random = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbol = "!@#$%^&*";
        String password = "";

        int r = random.nextInt(letters.length());
        password += letters.charAt(r);

       //letters
        r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);

            //digits
        r = random.nextInt(digits.length());
        password += digits.charAt(r);
        r = random.nextInt(digits.length());
        password += digits.charAt(r);
        r = random.nextInt(digits.length());
        password += digits.charAt(r);
        r = random.nextInt(digits.length());
        password += digits.charAt(r);

            //symbols
        r = random.nextInt(symbol.length());
        password += symbol.charAt(r);

        return password;
    }
}
