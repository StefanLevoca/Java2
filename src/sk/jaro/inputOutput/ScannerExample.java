package sk.jaro.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("resources/text.txt"));
//        scanner.useDelimiter(",");
        if(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        }
    }
}
