package com.gpteam.shopmanager.Engine;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler;

import java.util.HashMap;

/*
 * Created by masmix on 07.02.2017.
 */
public class Engine {
    private HashMap<String,Class> modules;

    public Engine() {
        initialize();
    }

    public void initialize() {
        modules = new HashMap<String, Class>();
        modules.put("ErrorHandler", ErrorHandler.class);
    }

    public void invoke(String className, String methodName) {
        try { modules.get(className).getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            ErrorHandler.handleNoSuchMethodException("No such method. Found: " + methodName);
        }
    }
}
