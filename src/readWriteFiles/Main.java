package readWriteFiles;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "test.txt";
        String destinationPath = "new.txt";

        try {
            CopyFile.copyFile(sourcePath, destinationPath);
            System.out.println("File copied successfuly");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
