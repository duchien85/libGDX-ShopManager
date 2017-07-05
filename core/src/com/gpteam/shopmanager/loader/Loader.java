package com.gpteam.shopmanager.loader;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;

import java.io.*;
import java.util.ArrayList;

import static com.gpteam.shopmanager.variables.Variables.NAMES_PATH;

/*
 * Created by masmix on 04.02.2017.
 */
public class Loader {
    private Loader() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    private Loader instance = null;

    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private boolean initialized = false;

    public Loader getInstance() {
        if (instance == null)
            instance = new Loader();
        return instance;
    }

    public void initialize() {
            file = new File(NAMES_PATH);
            try { fileReader = new FileReader(file); }
            catch (FileNotFoundException e) { e.printStackTrace(); }
            bufferedReader = new BufferedReader(fileReader);
            initialized = true;
    }

    public void initialize(String filePath) {
        file = new File(filePath);
        try { fileReader = new FileReader(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
        bufferedReader = new BufferedReader(fileReader);
    }

    public ArrayList<String> getAll() {
        if (!initialized)
            initialize();
        String line;
        ArrayList<String> strings = new ArrayList<String>();
        try {
            while ((line = bufferedReader.readLine()) != null)
            strings.add(line);
        } catch (IOException e) { e.printStackTrace(); }

        return strings;
    }

    public BufferedReader getBufferedReader() {
        if (!initialized)
            initialize();
        return bufferedReader;
    }
}
