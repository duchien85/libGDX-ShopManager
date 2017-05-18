package com.gpteam.shopmanager.Economy;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.math.BigDecimal;

/*
 * Created by masmix on 02.02.2017.
 */
public class Economy {
    private float economyBar;
    private float dailyVariation;
    private static final float MIN_DAILY_VARIATION = -0.4f;
    private static final float MAX_DAILY_VARIATION = 0.4f;
    private static final float MAX_ECONOMY_BAR_VALUE = 5.0f;
    private static final float MIN_ECONOMY_BAR_VALUE = 0.0f;

    private Economy() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }


    public float getEconomyBar() {
        return economyBar;
    }
    
    public void raiseEconomyBar(float amount) {
        if (amount + economyBar >= MIN_ECONOMY_BAR_VALUE && amount + economyBar <= MAX_ECONOMY_BAR_VALUE)
            economyBar += amount;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void lowerEconomyBar(float amount) {
        if (amount <= economyBar)
    		economyBar -= amount;
        else
    		ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void setEconomyBar(float economyBar) {
        if (economyBar >= MIN_ECONOMY_BAR_VALUE && economyBar <= MAX_ECONOMY_BAR_VALUE)
            this.economyBar = economyBar;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void update() {
        dailyVariation = MathUtils.random(MIN_DAILY_VARIATION, MAX_DAILY_VARIATION);
        if (economyBar + dailyVariation >= MIN_ECONOMY_BAR_VALUE && economyBar + dailyVariation <= MAX_ECONOMY_BAR_VALUE)
            economyBar += dailyVariation;
        // TODO add more logic to daily variation
        // for example: if economyBar is 4.9f, and daily variation gets a random +0.3
        // add 0.1 instead of doing nothing
    }
}
