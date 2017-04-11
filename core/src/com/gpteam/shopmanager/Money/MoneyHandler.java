package com.gpteam.shopmanager.Money;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

/*
 * Created by masmix on 23.12.2016.
 */
public class MoneyHandler {
    private float money;

    public void add(float amount) {
        money += amount;
    }

    public void sub(float amount) {
        if (!(amount > money))
            money -= amount;
        else
            ErrorHandler.handleIllegalArgumentException("MSG");
    }
}
