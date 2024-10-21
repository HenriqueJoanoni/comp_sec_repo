package compSecLab3;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ValidationUtils utils = new ValidationUtils();
        Scanner option = new Scanner(System.in);

        boolean validUserName = false,
                validPhoneNumber = false,
                validAreaCode = false,
                validDkitNumber = false,
                isvalidPassword = false,
                isvalidBinary = false,
                isWeekend = false;

        System.out.println("Select the type of data you want to validate \n" +
                "1 - Username\n" +
                "2 - Phone Number\n" +
                "3 - Area Code\n" +
                "4 - DKIT Student Number\n" +
                "5 - Password\n" +
                "6 - Check If it's a binary\n" +
                "7 - Check if it's a weekend day\n");

        switch (option.nextInt()) {
            case 1:
                while (!validUserName) {
                    String input = utils.getInput("Please enter a username with letters...");
                    if (utils.validateUserName(input)) {
                        validUserName = true;
                        System.out.println("Username is valid!!");
                    }
                }
                break;
            case 2:
                while (!validPhoneNumber) {
                    String input = utils.getInput("Please enter a valid Phone Number...");
                    if (utils.validatePhone(input)) {
                        validPhoneNumber = true;
                        System.out.println("Phone number is valid!!");
                    }
                }
                break;
            case 3:
                while (!validAreaCode) {
                    String input = utils.getInput("Please enter a valid area code...");
                    if (utils.validateAreaCode(input)) {
                        validAreaCode = true;
                        System.out.println("Area code is valid!!!");
                    }
                }
                break;
            case 4:
                while (!validDkitNumber) {
                    String input = utils.getInput("Please enter a valid DKIT student number...");
                    if (utils.validateDkitNumber(input)) {
                        validDkitNumber = true;
                        System.out.println("DKIT number is valid!!!");
                    }
                }
            case 5:
                while (!isvalidPassword) {
                    String input = utils.getInput("Please enter a valid Password...");
                    if (utils.validatePassword(input)) {
                        isvalidPassword = true;
                        System.out.println("Password is valid!!!");
                    }
                }
            case 6:
                while (!isvalidBinary) {
                    String input = utils.getInput("Please insert a binary number...");
                    if (utils.checkIfItsBinary(input)) {
                        isvalidBinary = true;
                        System.out.println("This is a valid binary number!!!");
                    }
                }
            case 7:
                while (!isWeekend) {
                    String input = utils.getInput("Please check if it's weekend...");
                    if (utils.checkIfIsSaturdaySunday(input)) {
                        isWeekend = true;
                        System.out.println("It's a valid weekend day!!!");
                    }
                }
        }
    }
}
