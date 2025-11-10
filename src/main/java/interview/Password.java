package interview;

import java.util.Random;

public class Password {

    public static String generatePassword() {
        Random random = new Random();

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";

        String password = "";

        // Add 5 random letters
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(letters.length());
            password += letters.charAt(r);
        }

        // Add 4 random digits
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(digits.length());
            password += digits.charAt(r);
        }

        // Add 1 random symbol
        int r = random.nextInt(symbols.length());
        password += symbols.charAt(r);

        return password;
    }
}

