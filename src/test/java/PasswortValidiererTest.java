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
    void checkCamelCaseUp() {
        //GIVEN
        String passwort = "AAAA";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCase(passwort);

        //THEN
        assertFalse(result);
    }

    @Test
    void checkCamelCaseLow() {
        //GIVEN
        String passwort = "aaaa";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCase(passwort);

        //THEN
        assertFalse(result);
    }

    @Test
    void checkCamelCaseUpAndLow() {
        //GIVEN
        String passwort = "aAAa";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCase(passwort);

        //THEN
        assertTrue(result);
    }

    @Test
    void checkCamelCaseV1_2Up() {
        //GIVEN
        String passwort = "AAAA";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCaseV1_2(passwort);

        //THEN
        assertFalse(result);
    }

    @Test
    void checkCamelCaseV1_2Low() {
        //GIVEN
        String passwort = "aaaa";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCaseV1_2(passwort);

        //THEN
        assertFalse(result);
    }

    @Test
    void checkCamelCaseV1_2UpAndLow() {
        //GIVEN
        String passwort = "aAAa";

        //WHEN
        boolean result = PasswortValidierer.checkCamelCaseV1_2(passwort);

        //THEN
        assertTrue(result);
    }

}
