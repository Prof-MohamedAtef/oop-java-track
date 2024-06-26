package junetwentyfour.bankuser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    final static String DIGITS_REGEX = "^[0-9]+$";

    static boolean validateInput(String input) {
        Pattern pattern = Pattern.compile(DIGITS_REGEX);
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            System.out.println("Enter digits only!");
            return false;
        } else {
            return true;
        }
    }
}
