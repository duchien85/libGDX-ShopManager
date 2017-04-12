package com.gpteam.shopmanager.Society;

/*
 * Created by masmix on 18.01.2017.
 */
public enum ESocietyClass {
    RICH, POOR, DRUNK, MIDDLE_CLASS, TEENAGER, STUDENT;

    public static ESocietyClass getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
