import javax.swing.*;
import java.sql.SQLOutput;

public class PasswortValidierer {

    public static void main(String[] args) {
        testName();
    }


    public static boolean pwLengthCheck(String passwort) {

        return 8 <= passwort.length() && passwort.length() <= 100;

    }

    public static boolean checkDigitOrNot(String passwort) {

        return passwort.matches(".*\\d.*");

    }

    public static boolean checkCamelCase(String passwort) {
        if (passwort.equals(passwort.toUpperCase()) || passwort.equals(passwort.toLowerCase())) {
            return false;
        }
        return true; //hier kein else einfach un platz zu sparen

    }

    public static boolean checkCamelCaseV1_2(String passwort) {
        if (passwort.equals((passwort.toUpperCase()))){
            return false;
        }
        if (passwort.equals(passwort.toLowerCase())){
            return false;
        }
        return true;  //das else { return true; } können wir uns hier Sparen und return true direkt ausgeben.
    }

    public static void testName(){   //Visualisierung und Erklärung von "camelCase"
        String name = "Hallo";
        System.out.println(name);
        System.out.println("ist " + name + " = " + name.toUpperCase());
        System.out.println("ist " + name + " = " + name.toLowerCase());
    }

}



