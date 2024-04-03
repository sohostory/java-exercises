package readWriteFiles;

import java.io.*;

public class CopyFile {
    public static void copyFile (String sourcePath, String destinationPath) throws FileNotFoundException {
        try (FileReader reader = new FileReader(sourcePath);
             FileWriter writer = new FileWriter(destinationPath)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write((char) character);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
