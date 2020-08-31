package com.hillel.hw.hw12.taxPark.processor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Processor {
    public static String read() throws IOException {
        String content = null;
        try (FileInputStream fis = new FileInputStream(new File("Cars.txt"))) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);

            content = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void writeFile(File files, String text) throws IOException {
        try {
            FileWriter writer = new FileWriter(files);
            writer.write(text);
            writer.flush();

        } catch (NullPointerException e) {

        }
    }
}
