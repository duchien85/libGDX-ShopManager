package com.gpteam.shopmanager.Society;

/*
 * Created by masmix on 18.01.2017.
 */
public enum SocietyClass {
    RICH, POOR, DRUNK, MIDDLE_CLASS, TEENAGER, STUDENTS;

    public static SocietyClass getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
