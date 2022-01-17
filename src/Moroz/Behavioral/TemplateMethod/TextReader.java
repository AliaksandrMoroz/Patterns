package Moroz.Behavioral.TemplateMethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader extends Reader{

    @Override
    String readInReader(){
        File file = new File("Text");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = scanner.nextLine();
        return line;
    }
}
