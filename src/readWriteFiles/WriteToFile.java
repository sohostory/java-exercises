package readWriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeNames(String file, String[] names) throws FileNotFoundException {
        try (FileWriter writer = new FileWriter(file, true)) {
            for (String name : names) {
                writer.write(name + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
