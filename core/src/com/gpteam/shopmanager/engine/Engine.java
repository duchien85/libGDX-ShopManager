package com.gpteam.shopmanager.engine;

import com.gpteam.shopmanager.economy.Economy;
import com.gpteam.shopmanager.engine.modules.game_date.GameDate;
import com.gpteam.shopmanager.time.Time;

/*
 * Created by masmix on 07.02.2017.
 */
public final class Engine {
    private Economy economy;
    private GameDate gameDate;
    private Time time;
    /**
     *
     */
    public static int citizens;
    /**
     *
     */
    public static int[] citizenSocietyClasses;

    public void initialize() {


        economy = new Economy();
        gameDate = new GameDate();
        time = new Time();
    }

    public void update() {
        economy.update();
    }

    public Economy getEconomy() {
        return economy;
    }

    public GameDate getGameDate() {
        return gameDate;
    }

    public Time getTime() {
        return time;
    }

    public static int getCitizens() {
        return citizens;
    }

    public static int[] getCitizenSocietyClasses() {
        return citizenSocietyClasses;
    }
}
