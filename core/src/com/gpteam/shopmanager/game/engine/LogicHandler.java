package com.gpteam.shopmanager.game.engine;

import com.gpteam.shopmanager.advertising.Advertising;
import com.gpteam.shopmanager.city.City;
import com.gpteam.shopmanager.economy.Economy;
import com.gpteam.shopmanager.game.ShopManager;
import com.gpteam.shopmanager.game.engine.modules.game_date.GameDate;
import com.gpteam.shopmanager.time.Time;

/*
 * Created by masmix on 07.02.2017.
 */
public class LogicHandler {
    private City[] cities;

    public Economy economy;
    public GameDate gameDate;
    public Time time;
    public static int citizens;
    
    public LogicHandler() {
        initialize();
        cities = new City[2];
    }
    
    /**
    * Constructor with variable amount of cities, up to a maximum
    * of 3.
    */
    public LogicHandler(City... cities) {
        if (cities.length > ShopManager.MAX_CITIES)
    // TODO separate, so no variable arguments
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
        for(City x : cities) {
            count += x.getCitizenCount();
        }
        citizens = count;
        return count;
    }
}
