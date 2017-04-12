package com.gpteam.shopmanager.Society;

import com.gpteam.shopmanager.RandomGenerator.RandGen;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClass {
    private ESocietyClass ESocietyClass;

    public SocietyClass(ESocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }

    public SocietyClass() {
        ESocietyClass = RandGen.getSocietyClass();
    }

    public ESocietyClass getESocietyClass() {
        return ESocietyClass;
    }

    public void setESocietyClass(ESocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }
}
