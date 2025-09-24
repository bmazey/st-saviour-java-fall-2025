package interview;

import org.junit.jupiter.api.Test;

/*
 * TODO - BONUS +5 points!
 * 
 * Your test should cover the following cases:
 *   - Create a new password and ensure that the first 5 characters are letters.
 *   - Using the existing password, ensure that the next 4 characters are digits.
 *   - Using the existing password, ensure that the final character is a symbol.
 *   - Using the existing password, ensure that the length is 10.
 *   - Create two new passwords, and ensure that they are not equal.
 */
public class PasswordTest {

    @Test
    public void testPasswordComplexity() {
        // TODO Check password characters, digits, & symbols at specified positions.
        // HINT Java's Character class has rich support for classifying unicode symbols.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isLetter-char-
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isDigit-char-
        String password = Password.generatePassword();

        assert Character.isLetter(password.charAt(0));
        assert Character.isLetter(password.charAt(1));
        assert Character.isLetter(password.charAt(2));
        assert Character.isLetter(password.charAt(3));
        assert Character.isLetter(password.charAt(4));
        assert Character.isDigit(password.charAt(5));
        assert Character.isDigit(password.charAt(6));
        assert Character.isDigit(password.charAt(7));
        assert Character.isDigit(password.charAt(8));
        assert !Character.isLetterOrDigit(password.charAt(9));
    }

    @Test
    public void testPasswordLength() {
        // TODO Ensure that generated password is of length 10.
        String password = Password.generatePassword();
        assert password.length() == 10;
    }

    @Test
    public void testPasswordUnique() {
        // TODO Create two passwords and ensure that they do not equal each other.
        // NOTE We overlook collisions for the purpose of this exercise.
        String pass1 = Password.generatePassword();
        String pass2 = Password.generatePassword();

        assert ! pass1.equals(pass2);
    }
}
