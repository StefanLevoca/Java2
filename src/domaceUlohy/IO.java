package domaceUlohy;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IO {

    private void task1(String s) throws FileNotFoundException {
        System.out.println("TASK1");
        Scanner scanner = new Scanner(new FileInputStream(s));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    private void task2() throws IOException {
        System.out.println("TASK2");
        try (BufferedReader inputStream = new BufferedReader(new FileReader("resources/text.txt"));
             PrintWriter outputStream = new PrintWriter(new FileWriter("resources/output.txt"))) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
            outputStream.println();
        }
    }

    private void task3(String s) throws FileNotFoundException {
        System.out.println("TASK3");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(new FileInputStream(s));
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        int max = Integer.MIN_VALUE;
        String word = "";
        for (String str : list) {
            if (str.length() > max) {
                max = str.length();
                word = str;
            }
        }
        System.out.println(word);
    }

    private void task4(String s) throws IOException {
        System.out.println("TASK4");
        Path path = Paths.get("resources/text.txt");
        System.out.printf("Files.size %d bytes %n", Files.size(path));
    }

    private void task5(String s) {
        System.out.println("TASK5");
        if (Files.isDirectory(Paths.get(s))) {
            System.out.printf("Je to priecinok %s%n", s);
        }
        System.out.printf("Je to subor %s%n", s);
    }

    private void task6(String s) throws IOException {
        System.out.println("TASK6");
        // File file = new File(s);
        System.out.println(Arrays.toString(Files.list(Paths.get(s)).toArray()));
        //System.out.println(Arrays.toString(file.list()));
    }

    private void task7(String s) {
        System.out.println("TASK7");
        try {
            Files.delete(Paths.get(s));
        } catch (NoSuchFileException x) {
            System.err.printf("Neexistuje dany subor %s%n", s);
        } catch (DirectoryNotEmptyException x) {
            System.err.printf("Priecinok nie je prazdny %s%n", s);
        } catch (IOException x) {
            System.err.printf("Vstupno-vystupna chyba %s%n", x);
        }
    }

    private void task8(String from, String to) throws IOException {
        System.out.println("TASK8");
        Files.copy(Paths.get(from), Paths.get(to), StandardCopyOption.REPLACE_EXISTING);
    }

    private void task9(String s) throws IOException {
        System.out.println("TASK9");
        Files.createFile(Paths.get(s));
    }

    private void task10(String s) throws IOException {
        System.out.println("TASK10");
        Files.createFile(Paths.get(s));
        System.out.printf("Plna cesta %s%n", Paths.get(s));
    }

    public static void main(String[] args) {
        IO io = new IO();

//        try {
//            io.task1("resources/text.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            io.task2();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            io.task3("resources/text.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            io.task4("resources/text.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//            io.task5("resources/text.txt");
//
        try {
            io.task6("D:\\filmy");
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        io.task7("resources/text.txt");
//
//        try {
//            io.task8("D:\\downloads", "D:\\filmy");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            io.task9("C:\\Users\\stefa\\IdeaProjects\\Java2\\test.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            io.task10("C:\\Users\\stefa\\IdeaProjects\\Java2\\test.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
