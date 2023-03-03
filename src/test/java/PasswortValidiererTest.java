import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortValidiererTest {

    @Test
    void stimmtPasswortLaengeJA() {
        //GIVEN
        String passwort = "hallohallo";

        //WHEN
        boolean result = PasswortValidierer.pwLengthCheck(passwort);
        //THEN
        assertTrue(result);
    }
    @Test
    void stimmtPasswortLaengeNEIN() {
        //GIVEN
        String passwort = "hallo";

        //WHEN
        boolean result = PasswortValidierer.pwLengthCheck(passwort);
        //THEN
        assertFalse(result);
    }

}