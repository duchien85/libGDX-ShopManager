package com.gpteam.shopmanager.Engine;

import com.badlogic.gdx.Gdx;
import com.gpteam.shopmanager.Economy.Economy;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.util.HashMap;

/*
 * Created by masmix on 07.02.2017.
 */
public abstract class Engine implements Runnable {
    private HashMap<String,Class> modules;
    private Economy economy;

    @Override
    public void run() {
        // normal, "my" stuff


        // graphic stuff goes to libGDX:
        Gdx.app.postRunnable(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    public void initialize() {
        modules = new HashMap<String, Class>();
        modules.put("ErrorHandler", ErrorHandler.class);
    }

    public void invoke(String className, String methodName) {
        try { modules.get(className).getDeclaredMethod(methodName).invoke(null);
        } catch (Exception ex) { ErrorHandler.handleNoSuchMethodException("No such method. Found: " + methodName); }
    }

    public void update() {
        economy.update();
    }
}
