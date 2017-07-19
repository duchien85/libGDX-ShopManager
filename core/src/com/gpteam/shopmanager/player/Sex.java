package com.gpteam.shopmanager.player;

import com.gpteam.shopmanager.engine.modules.text_handler.Text;

/*
 * Created by masmix on 16.01.2017.
 */
public enum Sex {
    MALE, FEMALE;

    public static Sex getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    @Override
    public String toString() {
        if (this.equals(MALE))
            return Text.male;
        else
            return Text.female;
    }
}