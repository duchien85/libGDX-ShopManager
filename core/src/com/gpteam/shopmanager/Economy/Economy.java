package com.gpteam.shopmanager.Economy;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.math.BigDecimal;

/*
 * Created by masmix on 02.02.2017.
 */
public final class Economy {
    private static BigDecimal totalMoney; //needed?
    private static float economyBar;
    private static float dailyVariation;
    private static final float MIN_DAILY_VARIATION = -0.4f;
    private static final float MAX_DAILY_VARIATION = 0.4f;
    private static final float MAX_ECONOMY_BAR_VALUE = 5.0f;
    private static final float MIN_ECONOMY_BAR_VALUE = 0.0f;

    private Economy() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }


    public static float getEconomyBar() {
        return economyBar;
    }
    
    public static void raiseEconomyBar(float amount) {
        if (amount >= MIN_ECONOMY_BAR_VALUE && amount + MAX_ECONOMY_BAR_VALUE <= MAX_ECONOMY_BAR_VALUE)
            economyBar += amount;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public static void lowerEconomyBar(float amount) {
        if (amount <= economyBar)
    		economyBar -= amount;
        else
    		ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public static void setEconomyBar(float economyBar_) {
        if (economyBar >= MIN_ECONOMY_BAR_VALUE && economyBar <= MAX_ECONOMY_BAR_VALUE)
            economyBar = economyBar_;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public static void update() {
        dailyVariation = MathUtils.random(MIN_DAILY_VARIATION, MAX_DAILY_VARIATION);
        if (economyBar + dailyVariation >= MIN_ECONOMY_BAR_VALUE && economyBar + dailyVariation <= MAX_ECONOMY_BAR_VALUE)
            economyBar += dailyVariation;
        // TODO add more logic to daily variation
        // for example: if economyBar is 4.9f, and daily variation gets a random +0.3
        // add 0.1 instead of doing nothing
    }
    
    public static BigDecimal getTotalMoney() {
    		return totalMoney;
    }

    public static void addTotalMoney(BigDecimal money) {
        totalMoney = totalMoney.add(money);
    }
}
