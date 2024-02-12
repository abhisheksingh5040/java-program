package com.technoelevate.program.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Data {
    public static void main(String[] args) {
        getDataFromFile();
    }

    public static void getDataFromFile() {
        Path path = Path.of("/home/abhishek/Documents/imp/i.txt");

        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String s = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
