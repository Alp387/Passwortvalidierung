public class PasswortValidierer {


    public static boolean pwLengthCheck(String passwort) {

        return 8 <= passwort.length() && passwort.length() <= 100;

    }

    public static boolean checkDigitOrNot(String passwort) {

        return passwort.matches(".*\\d.*");

    }


}
