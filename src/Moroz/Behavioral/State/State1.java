package Moroz.Behavioral.State;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class State1 implements State{
    @Override
    public void run() {
        System.out.println("I readFile...");
        File file = new File("Text");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = scanner.nextLine();
        System.out.println("Text in file:"+line);
    }
}
