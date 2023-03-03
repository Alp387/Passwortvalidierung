import javax.swing.*;

public class PasswortValidierer {


    public static boolean pwLengthCheck(String passwort) {

        return 8 <= passwort.length() && passwort.length() <= 100;

    }

    public static boolean checkDigitOrNot(String passwort) {

        return passwort.matches(".*\\d.*");

    }

    public static boolean checkCamelCase(String passwort) {
        if (passwort.equals(passwort.toUpperCase()) || passwort.equals(passwort.toLowerCase())) {
        }
        return false;
    }
}





