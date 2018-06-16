package com.gpteam.shopmanager.economy;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.variables.Variables;

/*
 * Created by masmix on 02.02.2017.
 */
// TODO should handle every object ifluenced by economy, except the player's economy.
// Reason for this is that every price should be affected by "world economy",
// but the player has to adjust his prices - this is the part of the game
public class Economy {
    private float economyBar;
    private float dailyVariation;


    public float getEconomyBar() {
        return economyBar;
    }
    
    public void raiseEconomyBar(float amount) {
        if (amount + economyBar < Variables.MIN_ECONOMY_BAR_VALUE
                || amount + economyBar > Variables.MAX_ECONOMY_BAR_VALUE)
            ErrorHandler.handleIllegalArgumentException("msg");

        economyBar += amount;
    }
    
    public void lowerEconomyBar(float amount) {
        if (amount - economyBar < Variables.MIN_ECONOMY_BAR_VALUE
                || amount - economyBar > Variables.MAX_ECONOMY_BAR_VALUE)
    		ErrorHandler.handleIllegalArgumentException("msg");

        economyBar -= amount;
    }
    
    public void setEconomyBar(float economyBar) {
        if (economyBar < Variables.MIN_ECONOMY_BAR_VALUE
                || economyBar > Variables.MAX_ECONOMY_BAR_VALUE)
            ErrorHandler.handleIllegalArgumentException("msg");

        this.economyBar = economyBar;
    }

    public void update() {
        dailyVariation = MathUtils.random(Variables.MIN_DAILY_VARIATION, Variables.MAX_DAILY_VARIATION);
        // TODO Add more logic!
        if (economyBar + dailyVariation < Variables.MIN_ECONOMY_BAR_VALUE )
            economyBar = Variables.MIN_ECONOMY_BAR_VALUE;

        if (economyBar + dailyVariation > Variables.MAX_ECONOMY_BAR_VALUE)
            economyBar = Variables.MAX_ECONOMY_BAR_VALUE;

        if (economyBar + dailyVariation < Variables.MIN_DAILY_VARIATION)
            economyBar = Variables.MIN_ECONOMY_BAR_VALUE;
    }
}
