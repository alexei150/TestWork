package Test;

import Test.Generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Sorter {
    public static void main(String[] args) throws IOException {
        Generator.generate(100, 10000);
        FileWriter fileWriter = new FileWriter("result.txt", true);
        FileReader fileReader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try (bufferedReader) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String lineSeparator = System.getProperty("line.separator");
                String stri = line.chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                fileWriter.write(stri + lineSeparator);
                fileWriter.flush();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}