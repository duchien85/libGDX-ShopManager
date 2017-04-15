package com.gpteam.shopmanager.FileHandlers.Loaders;

import com.gpteam.shopmanager.FileHandlers.Loader;

import java.io.IOException;
import java.util.ArrayList;

import static com.gpteam.shopmanager.Variables.Variables.NAMES_PATH;

/*
 * Created by masmix on 02.02.2017.
 */
public final class NamesLoader {
    private static ArrayList<String> names;
    private static Loader loader;

    public NamesLoader(Loader loader) {
        this.loader = loader;
        names = new ArrayList<String>();
    }

    public NamesLoader() {
        loader = new Loader(NAMES_PATH);
        names = new ArrayList<String>();
    }

    public void initialize() {
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