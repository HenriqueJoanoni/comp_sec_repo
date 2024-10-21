package compSecLab3;

import java.util.Scanner;

public class Menu {
    public int initialMenu() {
        Scanner option = new Scanner(System.in);
        System.out.println("Select the type of data you want to validate \n" +
                "1 - Username\n" +
                "2 - Phone Number\n" +
                "3 - Area Code\n");
        return option.nextInt();
    }
}
