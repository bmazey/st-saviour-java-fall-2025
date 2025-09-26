package interview;

import org.junit.jupiter.api.Test;


public class PasswordTest {

    @Test
    public void testPasswordComplexity() {

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
        assert true;
    }

    @Test
    public void testPasswordLength() {
        String password = Password.generatePassword();
        assert password.length() == 10;
    }

    @Test
    public void testPasswordUnique() {
        String password = Password.generatePassword();
        String password2 = Password.generatePassword();
        assert !password.equals(password2);
    }
}
