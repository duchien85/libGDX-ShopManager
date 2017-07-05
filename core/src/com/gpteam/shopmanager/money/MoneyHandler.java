package com.gpteam.shopmanager.money;

import com.gpteam.shopmanager.engine.Modules.ErrorHandler.ErrorHandler;

/*
 * Created by masmix on 23.12.2016.
 */
public class MoneyHandler {
    private float money;

    public void add(float amount) {
        money += amount;
    }

    public void sub(float amount) {
        if (amount <= money)
            money -= amount;
        else
            ErrorHandler.handleIllegalArgumentException("MSG");
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
