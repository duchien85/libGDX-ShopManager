package com.gpteam.shopmanager.FileHandlers;

import java.io.*;
import java.util.ArrayList;

import static com.gpteam.shopmanager.Variables.Variables.NAMES_PATH;

/*
 * Created by masmix on 04.02.2017.
 */
public final class Loader {
    private static File file;
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public void initialize() {
        file = new File(NAMES_PATH);
        try { fileReader = new FileReader(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
        bufferedReader = new BufferedReader(fileReader);
    }

    public ArrayList<String> getAll() {
        String line;
        ArrayList<String> strings = new ArrayList<String>();
        try {
            while ((line = bufferedReader.readLine()) != null)
            strings.add(line);
        } catch (IOException e) { e.printStackTrace(); }

        return strings;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }
}
