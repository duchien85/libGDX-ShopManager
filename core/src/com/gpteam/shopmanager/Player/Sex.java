package com.gpteam.shopmanager.Player;

/*
 * Created by masmix on 16.01.2017.
 */
public enum Sex {
    MALE, FEMALE;

    public static Sex getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}