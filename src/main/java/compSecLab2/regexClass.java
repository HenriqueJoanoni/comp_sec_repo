package compSecLab2;

import java.util.Scanner;

public class regexClass {
    public static void main(String[] args) {
//        String userEntry = primaryInstruction("Please enter the days of the week (Saturday or Sunday):");
//
//        System.out.println(daysOfWeek(userEntry));

//        String userEntry = primaryInstruction("Please enter a DKIT student number: ");
//        System.out.println(validDkitNumber(userEntry));

        String userEntry = primaryInstruction("Please, enter a valid Irish number: ");
        System.out.println(irishNumber(userEntry));

    }

    /**
     * MENU OPTIONS
     */
    public static String primaryInstruction(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static String onlyLetters(String inputString) {
//        String textPattern = "[a-zA-Z]+";
        String textPattern = "[\\D/]+";

        if (inputString.matches(textPattern)) {
            return "Valid String";
        }

        return "Invalid String";
    }

    public static String binaryOnly(String inputString) {
        String textPattern = "[0-1]+";

        if (inputString.matches(textPattern)) {
            return "Valid Binary";
        }

        return "Invalid Binary";
    }

    public static String daysOfWeek(String inputString) {

        String textPattern
                = "^(sun|Sun)(day|\\.)"
                + "?$|Sat(\\.|urday)"
                + "?$|sat(\\.|urday)\\.?$";

        if (inputString.matches(textPattern)) {
            return "Valid String " + inputString;
        }

        return "Invalid String " + inputString;
    }

    public static String validDkitNumber(String inputString) {
        String textPattern = "^D00[0-9]{6}";

        if (inputString.matches(textPattern)) {
            return "Valid Number " + inputString;
        }

        return "Invalid Number: " + inputString;
    }

    public static String irishNumber(String inputString) {
        String textPattern = "^08[3|5|6|7|9]";

        if (inputString.matches(textPattern)) {
            return "Valid Number: " + inputString;
        }

        return "Invalid Number: " + inputString;
    }

}
