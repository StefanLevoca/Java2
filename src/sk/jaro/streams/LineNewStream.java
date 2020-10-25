package sk.jaro.streams;

import java.io.*;

public class LineNewStream {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("resources/text.txt"));
            outputStream = new PrintWriter(new FileWriter("resources/output.txt"));

            PrintWriter finalOutputStream = outputStream;
            inputStream.lines().forEach(finalOutputStream::println);

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
