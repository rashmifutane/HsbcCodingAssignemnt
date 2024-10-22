package com.company;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class AsciiFileOperation {

  private final static Logger LOGGER = new Logger(FileProcessor.class.getName());
    public static void processFile(String inputPath, String outputPath) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String reversedLine = reverseContent(line);
                writer.write(reversedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            LOGGER.error("Exception occurred in processFile: " + e.getMessage());
        }
    }

    public static String reverseContent(String content) {
        return new StringBuilder(content).reverse().toString();
    }

    public static void main(String[] args) {
        processFile("source.txt", "output.txt");
    }
}

