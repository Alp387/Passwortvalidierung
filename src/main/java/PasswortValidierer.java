public class PasswortValidierer {


    public static boolean pwLengthCheck(String passwort) {

        return 8 <= passwort.length() && passwort.length() <= 100;

    }
}
