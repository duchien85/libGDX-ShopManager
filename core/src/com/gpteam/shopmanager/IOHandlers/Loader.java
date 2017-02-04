package com.gpteam.shopmanager.IOHandlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * Created by masmix on 04.02.2017.
 */
public final class Loader {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public Loader(String fileName) {
        file = new File(fileName);
        try { fileReader = new FileReader(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
        bufferedReader = new BufferedReader(fileReader);
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }
}
