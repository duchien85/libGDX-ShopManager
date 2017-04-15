package com.gpteam.shopmanager.FileHandlers;

import java.io.*;
import java.util.ArrayList;

import static com.gpteam.shopmanager.Variables.Variables.NAMES_PATH;

/*
 * Created by masmix on 04.02.2017.
 */
public final class Loader {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public Loader(String filePath) {
        file = new File(filePath);
        try { fileReader = new FileReader(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
        bufferedReader = new BufferedReader(fileReader);
    }

    public Loader() {
        file = new File(NAMES_PATH);
        try { fileReader = new FileReader(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
        bufferedReader = new BufferedReader(fileReader);
    }

    public void initialize() {
    }

    public ArrayList<String> read() {
        String line;
        ArrayList<String> strings = new ArrayList<String>();
        try { while ((line = getBufferedReader().readLine()) != null)
            strings.add(line);
        } catch (IOException e) { e.printStackTrace(); }
        return strings;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }
}
