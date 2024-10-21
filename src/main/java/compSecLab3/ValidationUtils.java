package compSecLab3;

import java.util.Scanner;

public class ValidationUtils {

    public String getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public boolean validateUserName(String userName) {
        String pattern = "[a-zA-Z0-9\\-_.]+";
        return userName.matches(pattern);
    }

    public boolean validateAreaCode(String areaCode) {
        String pattern = "[\\w\\s-]{7}+$";
        return areaCode.matches(pattern);
    }

    public boolean validatePhone(String phone) {
        String pattern = "^08[35679][0-9]{7}";
        return phone.matches(pattern);
    }

    public boolean validateDkitNumber(String dkitNumber) {
        String pattern = "^D00[0-9]{6}";
        return dkitNumber.matches(pattern);
    }

    public boolean validatePassword(String password) {
        String pattern = "^[^-\\s]\\w{10}+$";
        return password.matches(pattern);
    }

    public boolean checkIfItsBinary(String binaryNumber) {
        String pattern = "[0-1]+";
        return binaryNumber.matches(pattern);
    }

    public boolean checkIfIsSaturdaySunday(String weekend) {
        String pattern
                = "^(sun|Sun)(day|\\.)"
                + "?$|Sat(\\.|urday)"
                + "?$|sat(\\.|urday)\\.?$";
        return weekend.matches(pattern);
    }
}
