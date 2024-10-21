package compSecLab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

    public void readFromFile() throws IOException {
        File file = new File("src/simpleFile.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
