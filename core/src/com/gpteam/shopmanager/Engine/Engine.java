package com.gpteam.shopmanager.Engine;

import com.badlogic.gdx.Gdx;
import com.gpteam.shopmanager.Economy.Economy;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Engine.Modules.Game_data.GameDate;
import com.gpteam.shopmanager.Time.Time;

import java.util.HashMap;

/*
 * Created by masmix on 07.02.2017.
 */
public class Engine {
    private static Engine instance = null;
    private Engine() { ErrorHandler.handleUnsupportedOperationException("msg"); }

    private HashMap<String,Class> modules;
    private Economy economy;
    private GameDate gameDate;
    private Time time;
    private static boolean initialized = false;

    public static Engine getInstance() {
        if (instance == null)
            instance = new Engine();
        return instance;
    }

    public void initialize() {
        if (!initialized) {
            modules = new HashMap<String, Class>();
            modules.put("ErrorHandler", ErrorHandler.class);
            economy = new Economy();
            gameDate = new GameDate();
            time = new Time();
            initialized = true;
        }
        Engine.getInstance();
    }

    @SuppressWarnings("unchecked")
    public void invoke(String className, String methodName) {
        try { modules.get(className).getDeclaredMethod(methodName).invoke(null); }
        catch (Exception ex) { ErrorHandler.handleNoSuchMethodException("No such method. Found: " + methodName); }
    }

    public void update() {
        economy.update();
    }
}
