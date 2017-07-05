package com.gpteam.shopmanager.society;

/*
 * Created by masmix on 18.01.2017.
 */
public enum SocietyClass {
    RICH, POOR, DRUNK, MIDDLE_CLASS, TEENAGER, STUDENT;

    public static SocietyClass getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
