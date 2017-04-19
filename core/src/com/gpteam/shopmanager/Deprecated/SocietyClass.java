package com.gpteam.shopmanager.Deprecated;

import com.gpteam.shopmanager.RandomGenerator.RandGen;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClass {
    private com.gpteam.shopmanager.Society.SocietyClass ESocietyClass;

    public SocietyClass(com.gpteam.shopmanager.Society.SocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }

    public SocietyClass() {
        ESocietyClass = RandGen.getSocietyClass();
    }

    public com.gpteam.shopmanager.Society.SocietyClass getESocietyClass() {
        return ESocietyClass;
    }

    public void setESocietyClass(com.gpteam.shopmanager.Society.SocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }
}
