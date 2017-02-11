package com.gpteam.shopmanager.Engine;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler;

import java.util.HashMap;

/*
 * Created by masmix on 07.02.2017.
 */
public class Engine {
    private HashMap<String,Class> modules;

    public void initialize() {
        modules = new HashMap<String, Class>();
        modules.put("ErrorHandler", ErrorHandler.class);
    }
}
