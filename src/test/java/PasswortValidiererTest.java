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

    @Test
    void checkIfPwContainsBadString1() {
        //GIVEN
        String passwort = "passwort";
        //WHEN
        boolean result = PasswortValidierer.checkBadPw(passwort);
        //THEN
        assertTrue(result);
    }

    @Test
    void checkIfPwContainsBadString2() {
        //GIVEN
        String passwort = "password";
        //WHEN
        boolean result = PasswortValidierer.checkBadPw(passwort);
        //THEN
        assertTrue(result);
    }
    @Test
    void checkIfPwContainsBadString3() {
        //GIVEN
        String passwort = "12345678";
        //WHEN
        boolean result = PasswortValidierer.checkBadPw(passwort);
        //THEN
        assertTrue(result);
    }

    @Test
    void checkDigitIrNotV2Test_WithDigitMusstBeTrue() {
        //GIVEN
        String passwort = "asd32132";
        //WHEN
        boolean result = PasswortValidierer.checkDigitOrNotV2(passwort);
        //THEN
        assertTrue(result);
    }

    @Test
    void checkDigitIrNotV2Test_WithNoDigitMusstBeFalse() {
        //GIVEN
        String passwort = "asdasdad";
        //WHEN
        boolean result = PasswortValidierer.checkDigitOrNotV2(passwort);
        //THEN
        assertFalse(result);
    }

    @Test
    void checkCorrectPw1(){
        //GIVEN
        String passwort = "AA123xxasdF5";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertTrue(result);

    }
    @Test
    void checkWrongPw1(){
        //GIVEN
        String passwort = "AAxxffdfdfdffasd";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertFalse(result);
    }

    @Test
    void checkWrongPwNoUpperCaseRS(){
        //GIVEN
        String passwort = "123564654asddad";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertFalse(result);
    }

    @Test
    void checkWrongPwNoLowwerCaseRS(){
        //GIVEN
        String passwort = "154SDA1354§$";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertFalse(result);
    }

    @Test
    void checkWrongPwToShortRS(){
        //GIVEN
        String passwort = "Aa12$";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertFalse(result);
    }

    @Test
    void checkWrongPwToLongRS(){
        //GIVEN
        String passwort = "Aa1234567890ASlasdljhdföjlhasdöjlhasdöjlhÖLJHDÖjÖJLHdÖJASDJHASDjlöhäafkäjasasdklasdjkl3495873945uiohdsfjhdsfh789345893touhjdsfjöhdsfjpöhdsfhjdsfjohfsdjhdsfjöhsdfjödfhsjöfhhj4p789z543uhdsfsd";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertFalse(result);
    }

    @Test
    void checkWrongPwToWeakRS(){
        //GIVEN
        String passwort = "Passwort123";
        //WHEN
        boolean result = PasswortValidierer.istPwKorrekt(passwort);
        //THEN
        assertFalse(result);
    }

}

//New