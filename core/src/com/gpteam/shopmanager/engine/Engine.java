package com.gpteam.shopmanager.engine;

import com.gpteam.shopmanager.economy.Economy;
import com.gpteam.shopmanager.engine.modules.game_date.GameDate;
import com.gpteam.shopmanager.time.Time;

/*
 * Created by masmix on 07.02.2017.
 */
public final class Engine {
    public Economy economy;
    public GameDate gameDate;
    public Time time;
    /** comment here */
    public static int citizens;

    public void initialize() {
        economy = new Economy();
        gameDate = new GameDate();
        time = new Time();
    }

    public void update() {
        economy.update();
    }

    public static int getCitizens() {
        return citizens;
    }
}
