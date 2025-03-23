package rocks.zipcode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class
public class PasswordValidatorTest {
    // TODO: Write tests for the PasswordValidator class
    // Test cases should include:
    // - Valid passwords
    // - Passwords that are too short or too long
    // - Passwords missing uppercase, lowercase, digits, or special chars
    // - Edge cases like null or empty strings
    private final PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    public void testPasswordIsNull() {
        assertFalse(passwordValidator.isValid(null));
    }

    @Test
    public void testPassword1(){
        assertTrue(passwordValidator.isValid("Thisisatest!67"));
    }

    @Test
    public void testPassword2(){
        assertTrue(passwordValidator.isValid("ZipCodeIsDope2!"));
    }

    @Test
    public void testPassword3(){
        assertTrue(passwordValidator.isValid("AintLifeSoGood?!?7"));
    }

    @Test
    public void testPassword4(){
        assertFalse(passwordValidator.isValid("it'ssmall3"));
    }
}

