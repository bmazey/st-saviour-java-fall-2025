package interview;

import java.io.Console;
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
        String symbols = "!@#$%^&*";

        String password = "";
        
        // 5 Letters:
        int r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);
        r = random.nextInt(letters.length());
        password += letters.charAt(r);

        //4 Digits:
        r = random.nextInt(digits.length());
        password += digits.charAt(r);
        r = random.nextInt(digits.length());
        password += digits.charAt(r);
        r = random.nextInt(digits.length());
        password += digits.charAt(r);
        r = random.nextInt(digits.length());
        password += digits.charAt(r);        

        //1 Symbol:
        r = random.nextInt(symbols.length());
        password += symbols.charAt(r);

        return password;  

        // System.out.println("The random number is: " + r);
        // System.out.println("The random letter is: " + s.charAt(r));
        // generatePassword();
        // string letters = java.util.Random();
        // char symbols = 
        // int number = new Random();
        // string num = "1 2 3 4 5 6 7 8 9 10 11 12 ";
        // int length = num.Length;
        // Console.WriteLine($"A twelve sided die has the numbers {num}");
        // Random generator = new Random(DateTime.Now.Millisecond);
        // int letterIndex = generator.Next(length);
        // Console.WriteLine( + num[letterIndex]);

          
    }
}
