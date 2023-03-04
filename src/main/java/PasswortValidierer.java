import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;


//  Kleine Notiz von mir (Robin)
//
//  Was ich am Wochenende KW9 noch am Projekt gemacht habe.
//
//  1. .idea und target Ordner aus GitHub gelöscht.
//  2. Methode "isPwKorrect" auf Englisch geändert.
//  3. Für "checkCamelCase" aus einer Methode zwei gemacht und
//     umbenannt in "***UpperCase & ***LowerCase".
//  4. checkBadPw hat eine zweite Version, die mit einem Array arbeitet.
//     Die Methode läuft mit einer While-Schleife durch jedes Array.
//     Vorteil: Man kann nun viel schneller neue schwache Passwörter hinzufügen, indem man einfach das Array erweitert.
//     Erklärungen zu den Methoden/Codes sind meist als Notizen im Code enthalten.
//
//  5. Die checkBadPw Version 2 hat auch JUnit Tests bekommen.
//  6.checkDigitOrNot hat eine Version 3 erhalten. Xin's Version war mir zu "professionell",
//  V2 zu lang und V3 mit Array und While-Schleife perfekt. Alle Versionen haben einen eigenen Test.
//  7. checkPasswordContainsOnlyDigitV2 wurde aus dem gleichen Grund wie Punkt 6 hinzugefügt.
//

public class PasswortValidierer {

    public static void main(String[] args) {
        testName();
    }


    public static boolean checkIfPwIsCorrect(String passwort) {
        return pwLengthCheck(passwort) && checkDigitOrNotV3(passwort)
                && checkPwUpperCase(passwort) && checkPwLowerCase(passwort)
                && !checkBadPw(passwort) && !checkBadPwV2(passwort) && checkDigitOrNotV2(passwort)
                && checkDigitOrNot(passwort) && checkPasswordContainsOnlyDigitV2(passwort);
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
        }
        return false;
    }

    public static boolean checkDigitOrNotV3(String passwort) {
        String[] digit = new String[10];

        digit[0] = "0";
        digit[1] = "1";
        digit[2] = "2";
        digit[3] = "3";
        digit[4] = "4";
        digit[5] = "5";
        digit[6] = "6";
        digit[7] = "7";
        digit[8] = "8";
        digit[9] = "9";

        int i = 0;
        while (i < digit.length) {
            if (passwort.contains(digit[i])) {
                return true;
            }
            i++;
        }
        return false;

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

        if (passwort.equalsIgnoreCase("passwort") || passwort.equalsIgnoreCase("password") || passwort.equalsIgnoreCase("12345678") || passwort.equalsIgnoreCase("Passwort123")) {
            return true;
        } else {
            return false;
        }

    }  //Mit dieser Methode nicht praktikabel bei einer
    // großen Anzahl von Wörtern mit einfachen Passwörtern.
    // Sollte mit einem Array gemacht werden

    public static boolean checkBadPwV2(String passwort) {
        String[] badPw = new String[4];

        badPw[0] = "passwort";
        badPw[1] = "password";
        badPw[2] = "12345678";
        badPw[3] = "Passwort123";

        int i = 0;
        while (i < badPw.length) {                       //Die Schleife ersetz die Zahl im Array [] startet mit 0 da int i =0
            if (passwort.equalsIgnoreCase(badPw[i])) {   //prüft ob badPw true ist wenn ja sollte es fail sein
                return true;                             // wenn nein wird i = 0 durch i++ um 1 erhöht und der nächste Array wird geprüft
            }                                             // solange bis alle Arrays durch sind da (i < badPw.length)
            i++;
        }

        return false;
    }


    public static boolean checkPasswordContainsOnlyDigit(String password) {
        return password.matches("^\\d+$");
    }

    public static boolean checkPasswordContainsOnlyDigitV2(String passwort) {
        String[] character = new String[58];

        character[0] = "a"; character[29] = "A";
        character[1] = "b"; character[30] = "B";
        character[2] = "c"; character[31] = "C";
        character[3] = "d"; character[32] = "D";
        character[4] = "e"; character[33] = "E";
        character[5] = "f"; character[34] = "F";
        character[6] = "g"; character[35] = "G";
        character[7] = "h"; character[36] = "H";
        character[8] = "i"; character[37] = "I";
        character[9] = "j"; character[38] = "J";
        character[10] = "k"; character[39] = "K";
        character[11] = "l"; character[40] = "L";
        character[12] = "m"; character[41] = "M";
        character[13] = "n"; character[42] = "N";
        character[14] = "o"; character[43] = "O";
        character[15] = "p"; character[44] = "P";
        character[16] = "q"; character[45] = "Q";
        character[17] = "r"; character[46] = "R";
        character[18] = "s"; character[47] = "S";
        character[19] = "t"; character[48] = "T";
        character[20] = "u"; character[49] = "U";
        character[21] = "v"; character[50] = "V";
        character[22] = "w"; character[51] = "W";
        character[23] = "x"; character[52] = "X";
        character[24] = "y"; character[53] = "Y";
        character[25] = "z"; character[54] = "Z";
        character[26] = "ö"; character[55] = "Ö";
        character[27] = "ä"; character[56] = "Ä";
        character[28] = "ü"; character[57] = "Ü";

        int i = 0;
        while (i < character.length) {
            if (passwort.contains(character[i])) {
                return true;
            }
            i++;
            System.out.println(i);
        }
        return false;


    }



}







