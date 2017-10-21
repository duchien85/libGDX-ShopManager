package com.gpteam.shopmanager.engine;

import com.gpteam.shopmanager.advertising.Advertising;
import com.gpteam.shopmanager.city.City;
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
    private City[] cities;
    /** comment here */
    public static int citizens;
    
    public static final int MAX_CITIES = 3;
    public static final int DEFAULT_CITIES = 2;
    
    public Engine() {
    initialize();
    cities = new City[2];
    }
    
    /**
    * Constructor with variable amount of cities, up to a maximum
    * of 3.
    */
    public Engine(City... cities) {
        if (cities.length > MAX_CITIES)
            throw new IllegalArgumentException("msg");
        this.cities = cities;
    }

    public void initialize() {
        economy = new Economy();
        gameDate = new GameDate();
        time = new Time();
        
        Advertising advertising = new Advertising();
    }

    public void update() {
        economy.update();
    }

    public int getCitizenCount() {
        int count = 0;
        for(int i = 0; i < cities.length; i++) {
            count += cities[i].getCitizenCount();
        }
        citizens = count;
        return count;
    }
}
