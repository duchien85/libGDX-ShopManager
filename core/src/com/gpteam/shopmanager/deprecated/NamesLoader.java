package com.gpteam.shopmanager.deprecated;

import com.gpteam.shopmanager.loader.Loader;

import java.io.IOException;
import java.util.ArrayList;

/*
 * Created by masmix on 02.02.2017.
 */
public final class NamesLoader {
    private static ArrayList<String> names;
    private static Loader loader;

//    public void initialize() {
//        loader = new Loader(NAMES_PATH);
//        names = new ArrayList<String>();
//    }
//
//    public void initialize(String namesPath) {
//        if (!(namesPath.isEmpty()))
//            loader = new Loader(NAMES_PATH);
//        else
//            names = new ArrayList<String>();
//    }

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