import javax.swing.*;
import java.sql.SQLOutput;

public class PasswortValidierer {

    public static void main(String[] args) {
        testName();
    }

    public static boolean checkIfPwIsCorrect(String passwort) {
        return pwLengthCheck(passwort) && checkDigitOrNot(passwort)
                && checkPwUpperCase(passwort) && checkPwLowerCase(passwort) && !checkBadPw(passwort);
    }


    public static boolean pwLengthCheck(String passwort) {

        return 8 <= passwort.length() && passwort.length() <= 100;

    }

    public static boolean checkDigitOrNot(String passwort) {

        return passwort.matches(".*\\d.*");

    }

    public static boolean checkDigitOrNotV2(String passwort) {  //Hier noch einmal in einfacher, aber primitiver Form
        if (passwort.contains("1") || passwort.contains("2") || passwort.contains("3") || passwort.contains("4") || passwort.contains("5") || passwort.contains("6") || passwort.contains("7") || passwort.contains("8") || passwort.contains("9") || passwort.contains("0")) {
            return true;
        } return false;
    }

    public static boolean checkPwUpperCase(String passwort) {
        if (passwort.equals(passwort.toUpperCase())) {
            return false;
        }
        return true; //hier kein else einfach um platz zu sparen

    }

    public static boolean checkPwLowerCase(String passwort) {
        if (passwort.equals(passwort.toLowerCase())) {
            return false;
        }
        return true; //hier kein else einfach um platz zu sparen

    }


    public static void testName() {   //Visualisierung und Erklärung von "checkPwLowerCase & Upper Case"
        String name = "Hallo";
        System.out.println(name);
        System.out.println("ist " + name + " = " + name.toUpperCase());
        System.out.println("ist " + name + " = " + name.toLowerCase());
    }


    public static boolean checkBadPw(String passwort) {
        // Methode equalsIgnoreCase(String) überprüft String Parameter unabhängig von Groß- und Kleinschreibung

        if (passwort.equalsIgnoreCase("passwort") || passwort.equalsIgnoreCase("password") || passwort.equalsIgnoreCase("12345678") || passwort.equalsIgnoreCase("Passwort123"))  {
            return true;
        } else {
            return false;
        }

    }  //Mit dieser Methode nicht praktikabel bei einer
    // großen Anzahl von Wörtern mit einfachen Passwörtern.
    // Sollte mit einem Array gemacht werden

    public static boolean checkPasswordContainsOnlyDigit(String password){
        return password.matches("^\\d+$");
    }



}

// Test vom Ubuntu System
// Merge Test Update Sa 04.März 2023 15:00 Uhr bis hier alles korrekt!






