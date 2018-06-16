package com.gpteam.shopmanager.society;

import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;

/*
 * Created by masmix on 18.01.2017.
 */
public enum SocietyClass {
    RICH, POOR, DRUNK, MIDDLE_CLASS, TEENAGER, STUDENT;

    public static SocietyClass getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static boolean contains(SocietyClass societyClass) {
        if (societyClass == null)
            ErrorHandler.handleNullPointerException("msg");

        for (SocietyClass x : SocietyClass.values()) {
            if (x.name().contains(societyClass.name()))
                return true;
        }
        return  false;
    }
}
