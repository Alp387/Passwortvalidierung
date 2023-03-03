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

    @Test
    void checkDigitOrNot_ifYesTrue() {
        //GIVEN
        String passwort = "123HasanRockt";

        //WHEN
        boolean result = PasswortValidierer.checkDigitOrNot(passwort);

        //THEN
        assertTrue(result);
    }

    @Test
    void checkDigitOrNot_ifNoFalse() {
        //GIVEN
        String passwort = "XinRocktYeah";

        //WHEN
        boolean result = PasswortValidierer.checkDigitOrNot(passwort);

        //THEN
        assertFalse(result);

    }

    @Test
    void checkCamelCase() {
        //GIVEN
        String passwort = "AAAA";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCase(passwort);

        //THEN
        assertFalse(result);
    }

}
