package Woche1FrTestMuster;

public class Validation {

    public static String[] forbiddenList = {"aD12345678", "Passwort123", "DasIstBestimmt S1cher"};

    public static boolean validatePassword(String password) {
        return !isForbidden(password)
                && containsLowercase(password)
                && containsUppercase(password)
                && containsNumber(password)
                && isLongerThan7(password);
    }

    public static boolean isLongerThan7(String password) {
        return password.length() > 7;
    }


    public static boolean containsNumber(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars ) {
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUppercase(String password) {
        return !password.equals(password.toLowerCase()); // totalSicher85 == totalsicher85
    }

    public static boolean containsLowercase(String password) {
        return !password.equals(password.toUpperCase()); // totalSicher85 == TOTALSICHER85
    }

    public static boolean isForbidden(String password) {
        for (String s : forbiddenList) {
            if (s.equals(password)) {
                return true;
            }
        }
        return false;
    }
}