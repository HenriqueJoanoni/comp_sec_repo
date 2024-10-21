package compSecLab4;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ReadFromFile file = new ReadFromFile();

        int attempts = 0, stopTimer = 30;
        String userPassword;
        boolean isValid = false;

        System.out.println("To open this file, you have to enter your password!");
        while (!isValid) {
            if (attempts == 3) {
                System.out.println("You have been blocked...please wait " + stopTimer + " seconds");
                TimeUnit.SECONDS.sleep(stopTimer);
                stopTimer = stopTimer * 2;
                attempts = 0;
            }

            System.out.println("Please, enter your password: ");
            userPassword = sc.nextLine();

            if (ValidationUtil.CheckPassword(userPassword)) {
                isValid = true;
                stopTimer = 30;
                file.readFromFile();
            }

            attempts++;
        }
    }
}