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

    private Economy() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }


    public float getEconomyBar() {
        return economyBar;
    }
    
    public void raiseEconomyBar(float amount) {
        if (amount + economyBar >= Variables.MIN_ECONOMY_BAR_VALUE && amount + economyBar <= Variables.MAX_ECONOMY_BAR_VALUE)
            economyBar += amount;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void lowerEconomyBar(float amount) {
        if (amount - economyBar >= Variables.MIN_ECONOMY_BAR_VALUE && amount - economyBar <= Variables.MAX_ECONOMY_BAR_VALUE)
    		economyBar -= amount;
        else
    		ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void setEconomyBar(float economyBar) {
        if (economyBar >= Variables.MIN_ECONOMY_BAR_VALUE && economyBar <= Variables.MAX_ECONOMY_BAR_VALUE)
            this.economyBar = economyBar;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void update() {
        dailyVariation = MathUtils.random(Variables.MIN_DAILY_VARIATION, Variables.MAX_DAILY_VARIATION);
        if (economyBar + dailyVariation >= Variables.MIN_ECONOMY_BAR_VALUE && economyBar + dailyVariation <= Variables.MAX_ECONOMY_BAR_VALUE)
            economyBar += dailyVariation;

        else if (economyBar + dailyVariation > Variables.MAX_ECONOMY_BAR_VALUE)
            economyBar = Variables.MAX_ECONOMY_BAR_VALUE;

        else if (economyBar + dailyVariation < Variables.MIN_DAILY_VARIATION)
            economyBar = Variables.MIN_ECONOMY_BAR_VALUE;
    }
}
