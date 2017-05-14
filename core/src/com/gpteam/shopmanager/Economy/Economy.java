package com.gpteam.shopmanager.Economy;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.math.BigDecimal;

/*
 * Created by masmix on 02.02.2017.
 */
public class Economy {
    private BigDecimal totalMoney; //needed?
    private float economyBar;
    private static final float MIN_DAILY_VARIATION = 0.0f;
    private static final float MAX_DAILY_VARIATION = 0.7f;
    private static final float MAX_ECONOMY_BAR_VALUE = 5.0f;
    private static final float MIN_ECONOMY_BAR_VALUE = 0.0f;

    public Economy() {
        economyBar = 0.0f;
    }

    public Economy(float economyBar) {
        if (economyBar >= MIN_ECONOMY_BAR_VALUE && economyBar <= MAX_ECONOMY_BAR_VALUE)
            this.economyBar = economyBar;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public float getEconomyBar() {
        return economyBar;
    }
    
    public void raiseEconomyBar(float amount) {
        if (amount >= MIN_ECONOMY_BAR_VALUE && amount + MAX_ECONOMY_BAR_VALUE <= MAX_ECONOMY_BAR_VALUE)
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
    }
    
    public BigDecimal getTotalMoney() {
    		return totalMoney;
    }

    public void addTotalMoney(BigDecimal money) {
        totalMoney = totalMoney.add(money);
    }
}
