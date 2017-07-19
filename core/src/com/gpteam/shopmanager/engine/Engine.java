package com.gpteam.shopmanager.engine;

import com.badlogic.gdx.Gdx;
import com.gpteam.shopmanager.economy.Economy;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.game_date.GameDate;
import com.gpteam.shopmanager.time.Time;

import java.util.HashMap;

/*
 * Created by masmix on 07.02.2017.
 */
public class Engine implements Runnable {
    private static Engine instance = null;
    private Engine() { ErrorHandler.handleUnsupportedOperationException("msg"); }

    private HashMap<String,Class> modules;
    private Economy economy;
    private GameDate gameDate;
    private Time time;

    public static Engine getInstance() {
        if (instance == null)
            instance = new Engine();
        return instance;
    }

    @Override
    public void run() {
        // normal, "my" stuff
        initialize();

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

        economy = new Economy();
        gameDate = new GameDate();
        time = new Time();
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
