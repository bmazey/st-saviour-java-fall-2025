package interview;

import java.util.Random;

public class Password {
// All of these comments are overstimming me (brocken heart emoji)
    public static String generatePassword() {
    Random random = new Random();
        //These are the letter characters for the str. 
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // SIXXXXX SEVENNN, These are the numbers for the password
    String digits = "0123456789";
    //Finally, these are the symbols  (these took way too long)
    String symbols = "!@#$%^&*()-_+={}[]|;:,.<>?";
    StringBuilder password = new StringBuilder();

// I have never watched so many CPS videos to understand a concept in my life
    for(int i = 0; i < 4; i++) {
        password.append(letters.charAt(random.nextInt(letters.length())));
    }

    for (int i = 0; i < 4; i++) {
        password.append(digits.charAt(random.nextInt(digits.length())));
    }
    password.append(symbols.charAt(random.nextInt(symbols.length())));
    // My world is cru,bling as we speak /j
    return password.toString();
    }
public static void main(String[] args) {
    System.out.println(generatePassword());
}
}
//IT WORKS!!! I AM A BOSS!!! #codingqueen 
