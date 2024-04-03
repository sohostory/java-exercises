package readWriteFiles;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void readFile(String str) {
        try (FileReader reader = new FileReader(str)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
