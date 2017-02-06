package com.gpteam.shopmanager.FileHandlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }
}
