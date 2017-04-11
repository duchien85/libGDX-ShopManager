package com.gpteam.shopmanager.Money;

/*
 * Created by masmix on 23.12.2016.
 */
public class MoneyHandler {
    private float money;

    public void add(float amount) {
        money += amount;
    }

    public void sub(float amount) {
        money -= amount;
    }
}
