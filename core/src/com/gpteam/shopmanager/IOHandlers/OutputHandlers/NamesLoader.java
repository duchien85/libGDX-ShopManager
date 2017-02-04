package com.gpteam.shopmanager.IOHandlers.OutputHandlers;

import com.gpteam.shopmanager.IOHandlers.Loader;

import java.io.IOException;
import java.util.ArrayList;

/*
 * Created by masmix on 02.02.2017.
 */
public class NamesLoader {
    private ArrayList<String> names;
    private Loader loader;

    public NamesLoader(Loader loader) {
        this.loader = loader;
        names = new ArrayList<String>();
    }

    public NamesLoader() {
        loader = new Loader("names.txt");
        names = new ArrayList<String>();
    }

    public void load() {
        String line;
        try { while ((line = loader.getBufferedReader().readLine()) != null)
            names.add(line);
        } catch (IOException e) { e.printStackTrace(); }
    }

    public ArrayList<String> getNames() {
        return names;
    }
}